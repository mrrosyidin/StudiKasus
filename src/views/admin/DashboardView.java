package views.admin;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import views.book.HapusView;
import views.book.PerbaruiView;
import views.book.TambahView;

public class DashboardView extends JFrame{
    JButton cetak,tambah,ubah,hapus,keluar;
    JLabel label;
    
    public DashboardView(){
        setTitle("menu");
        setBounds(0,0,375,481);
        setLayout(null);

        label(133, 35);
        cetak(130, 161);
        tambah(130, 207);
        ubah(130, 253);
        hapus(130, 299);
        keluar(130, 345);
    }

    private void label(int x,int y){
        label = new JLabel("Menu");
        label.setBounds(x, y, 110, 45);
        label.setFont(new Font("serif",Font.BOLD,30));
        label.setForeground(Color.BLACK);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        add(label);
    }

    private void cetak(int x,int y){
        cetak = new JButton("cetak data");
        cetak.setBounds(x, y, 115, 30);
        add(cetak);

        cetak.addActionListener((e) -> {
            new TabelView().setVisible(true);
        });
    }

    private void tambah(int x,int y){
        tambah = new JButton("tambah data");
        tambah.setBounds(x, y, 115, 30);
        add(tambah);

        tambah.addActionListener((e) -> {
            TambahView tambahView = new TambahView();
            this.setVisible(false);
            tambahView.setVisible(true);
        });
    }

    private void ubah(int x,int y){
        ubah = new JButton("ubah data");
        ubah.setBounds(x, y, 115, 30);
        add(ubah);

        ubah.addActionListener((e) -> {
            PerbaruiView perbaruiView = new PerbaruiView();
            this.setVisible(false);
            perbaruiView.setVisible(true);
        });
    }

    private void hapus(int x,int y){
        hapus = new JButton("hapus data");
        hapus.setBounds(x, y, 115, 30);
        add(hapus);

        hapus.addActionListener((e) -> {
            HapusView hapusView = new HapusView();
            this.setVisible(false);
            hapusView.setVisible(true);
        });
    }

    private void keluar(int x,int y){
        keluar = new JButton("keluar");
        keluar.setBounds(x, y, 115, 30);
        add(keluar);

        keluar.addActionListener((e) -> {
            this.dispose();
        });
    }
}
