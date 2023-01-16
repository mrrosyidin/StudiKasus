package views.book;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controllers.BookController;
import views.admin.DashboardView;

public class HapusView extends JFrame{
    BookController _bookC = new BookController();
    JTextField hapusField;
    JButton hapButton, kembaliButton;
    JLabel hapusLabel, label;

    public HapusView(){

        setTitle("Hapus");
        setBounds(0, 0, 375, 481);
        setLayout(null);

        label();
        hapusLabel();
        hapusField(138,166);
        hapusButton(220, 391);
        kembaliButton();
    }

    private void label(){
        label = new JLabel("Tambah Buku");
        label.setBounds(88, 66, 200, 57);
        label.setFont(new Font("serif",Font.BOLD,20));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        add(label);
    }

    private void hapusLabel(){
        hapusLabel = new JLabel("code buku");
        hapusLabel.setBounds(38, 166, 100, 30);
        hapusLabel.setFont(new Font("serif",Font.ROMAN_BASELINE,14));
        add(hapusLabel);
    }

    private void hapusField(int x, int y){

        hapusField = new JTextField();
        hapusField.setBounds(x, y, 200, 30);
        add(hapusField);
    }

    private void hapusButton(int x, int y){

        hapButton = new JButton("hapus");
        hapButton.setBounds(x, y, 100, 30);
        add(hapButton);

        hapButton.addActionListener((e) -> {
            String item = hapusField.getText();

            if (_bookC.cari(item) != null)
                _bookC.hapus(item);
            else
                System.out.println("buku tidak ada");
        });
    }

    private void kembaliButton(){
        kembaliButton = new JButton("kembali");
        kembaliButton.setBounds(55, 391, 100, 30);
        add(kembaliButton);

        kembaliButton.addActionListener((e) -> {
            this.dispose();
            new DashboardView().setVisible(true);
        });
    }
}
