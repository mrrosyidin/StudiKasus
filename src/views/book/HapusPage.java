package views.book;

import java.util.Scanner;

import controllers.BookController;

public class HapusPage {
    BookController _bookcontroller = new BookController();
    Scanner input = new Scanner(System.in);

    public void hapus(){
        
        System.out.print("Masukkan code buku yang akan dihapus : ");
        String code = input.nextLine();

        if (_bookcontroller.cari(code) != null)
            _bookcontroller.hapus(code);
    }
}
