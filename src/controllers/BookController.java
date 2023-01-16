package controllers;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import entities.BookEntity;
import entities.ManagementBook;
import models.Book;

public class BookController {
    
    public void tambah(String tittle, String code, String author, String publisher){
        Book.create(new ManagementBook(tittle, code, author, publisher));
    }

    public void perbarui(String tittle, String code, String author, String publisher){
        Book.update(new ManagementBook(tittle, code, author, publisher));
    }

    public void hapus(String code){
        Book.remove(code);
    }

    public BookEntity cari(String code){
        return Book.search(code);
    }

    public ArrayList<BookEntity> getBook(){
        return Book.all();
    }

    public DefaultTableModel daftarBuku(){
        DefaultTableModel daftarBuku = new DefaultTableModel();
        Object[] kolom = {"Judul","Code","Penulis","Penerbit"};

        daftarBuku.setColumnIdentifiers(kolom);

        for (int i = 0; i < getBook().size(); i++){
            Object[] data = new Object[4];
            data[0] = getBook().get(i).getTittle();
            data[1] = getBook().get(i).getCode();
            data[2] = getBook().get(i).getAuthor();
            data[3] = getBook().get(i).getPublisher();

            daftarBuku.addRow(data);
        }
        return daftarBuku;
    }
}
