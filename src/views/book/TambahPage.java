package views.book;

import java.util.Scanner;

import controllers.BookController;

public class TambahPage {
    BookController _bookcontroller = new BookController();
    Scanner input = new Scanner(System.in);

    public void tambah(){
        System.out.print("Masukkan judul buku       : ");
        String judul = input.nextLine();
        System.out.print("Masukkan code buku        : ");
        String code = input.nextLine();
        System.out.print("MMasukkan penulis buku    : ");
        String penulis = input.nextLine();
        System.out.print("Masukkan penerbit buku    : ");
        String penerbit = input.nextLine();

        _bookcontroller.tambah(judul, code, penulis, penerbit);
    }
}
