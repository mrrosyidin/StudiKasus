package views.book;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controllers.BookController;
import views.admin.DashboardView;

public class PerbaruiView extends JFrame{

    BookController _bookC = new BookController();
    JLabel label, codeLabel, juduLabel, penulisLabel, penerbitLabel;
    JTextField codeField,judulField, penulisField, penerbitField;
    JButton perbarButton, kembaliButton;

    public PerbaruiView(){

        setTitle("Perbarui");
        setBounds(0, 0, 375, 481);
        setLayout(null);

        label();
        codeLabel();
        codeField(138, 211);
        juduLabel();
        judulField(138, 166);
        penulisLabel();
        penulisField(138, 256);
        penerbitLabel();
        penerbitField(138, 301);
        perbarButton(220, 391);
        kembaliButton();
    }

    private void label(){
        label = new JLabel("Perbarui buku");
        label.setBounds(88, 66, 200, 57);
        label.setFont(new Font("serif",Font.BOLD,20));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        add(label);
    }

    private void codeLabel(){
        codeLabel = new JLabel("Code buku");
        codeLabel.setBounds(38, 211, 100, 30);
        codeLabel.setFont(new Font("serif",Font.ROMAN_BASELINE,14));
        add(codeLabel);
    }

    private void codeField(int x, int y){

        codeField = new JTextField();
        codeField.setBounds(x, y, 200, 30);
        add(codeField); 
    }

    private void juduLabel(){
        juduLabel = new JLabel("Judul buku");
        juduLabel.setBounds(38, 166, 100, 30);
        juduLabel.setFont(new Font("serif",Font.ROMAN_BASELINE,14));
        add(juduLabel);
    }

    private void judulField(int x, int y){

        judulField = new JTextField();
        judulField.setBounds(x, y, 200, 30);
        add(judulField);
    }

    private void penulisLabel(){
        penulisLabel = new JLabel("Penulis");
        penulisLabel.setBounds(38, 256, 100, 30);
        penulisLabel.setFont(new Font("serif",Font.ROMAN_BASELINE,14));
        add(penulisLabel);
    }

    private void penulisField(int x, int y){
        penulisField = new JTextField();
        penulisField.setBounds(x, y, 200, 30);
        add(penulisField);
    }

    private void penerbitLabel(){
        penerbitLabel = new JLabel("Penerbit");
        penerbitLabel.setBounds(38, 301, 100, 30);
        penerbitLabel.setFont(new Font("serif",Font.ROMAN_BASELINE,14));
        add(penerbitLabel);
    }

    private void penerbitField(int x, int y){
        penerbitField = new JTextField();
        penerbitField.setBounds(x, y, 200, 30);
        add(penerbitField);
    }

    private void perbarButton(int x, int y){
        perbarButton = new JButton("perbarui");
        perbarButton.setBounds(x, y, 100, 30);
        add(perbarButton);

        perbarButton.addActionListener((e) -> {
            String code = codeField.getText();
            String judul = judulField.getText();
            String penulis = penulisField.getText();
            String penerbit = penerbitField.getText();

            if (_bookC.cari(code) != null){
                _bookC.perbarui(judul, code, penulis, penerbit);
            }
            else
                System.out.println("data tidak ada");
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
