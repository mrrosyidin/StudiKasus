package views.book;

import java.util.Scanner;

import controllers.BookController;

public class PerbaruiPage {
    BookController _bookcontroller = new BookController();
    Scanner input = new Scanner(System.in);

    public void perbarui(){

        System.out.print("Masukkan code buku yang akan diedit : ");
        String code = input.nextLine();

        if (_bookcontroller.cari(code) != null){
            input(code);
        }
        else {
            System.out.print("code buku tidak ditemukan");
        }
    }

    public void input(String code){

        System.out.print("Masukkan judul buku    : ");
        String judul = input.nextLine();
        System.out.print("Masukkan penulis buku  : ");
        String penulis = input.nextLine();
        System.out.print("Masukkan penerbit buku : ");
        String penerbit = input.nextLine();

        _bookcontroller.perbarui(judul, code, penulis, penerbit);
    }
}
