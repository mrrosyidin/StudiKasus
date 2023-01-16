package views.admin;

import java.util.ArrayList;
import java.util.Scanner;

import entities.BookEntity;
import models.Book;
import views.book.*;

public class DashboardPage {
    Scanner input = new Scanner(System.in);

    public void menu() {
        int pilihMenu = -1;

        do {
            System.out.println("\n========== MANAGEMENT PERPUSTAKAAN ==========");

            System.out.print("""
                    1. Cetak Data
                    2. Tambah Data
                    3. Ubah Data
                    4. Hapus Data
                    0. Keluar
                    Masukan Menu: """);

            pilihMenu = input.nextInt();
            input.nextLine();

            switchMenu(pilihMenu);

        } while (pilihMenu != 0);
    }

    private void switchMenu(int menu) {
        switch (menu) {
            case 1:
                cetak();
                break;

            case 2:
                new TambahPage().tambah();
                break;

            case 3:
                new PerbaruiPage().perbarui();
                break;

            case 4:
                new HapusPage().hapus();
                break;

            case 0:
                System.out.println("Bye...");
                break;

            default:
                System.out.println("Menu Tidak Valid !");
                break;
        }
    }

    public void cetak(){
        ArrayList<BookEntity> belist = Book.all();

        System.out.println("----------DAFTAR BUKU PERPUSTAKAAN---------");
        for (BookEntity be : belist){
            System.out.println("-------------------------------------------");
            System.out.println("Judul     : "+be.getTittle());
            System.out.println("code      : "+be.getCode());
            System.out.println("penulis   : "+be.getAuthor());
            System.out.println("penerbit  : "+be.getPublisher());
        }
    }
}
