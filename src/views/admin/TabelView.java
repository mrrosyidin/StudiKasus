package views.admin;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import controllers.BookController;
import entities.BookEntity;
import models.Book;

public class TabelView extends JFrame{
    
    JTable table;

    public TabelView(){
        setTitle("Table");
        setBounds(0, 0, 375, 481);
        setLayout(null);

        table();
    }

    private void table(){

        table = new JTable();

        JScrollPane f = new JScrollPane(table);
        f.setBounds(20, 50, 300, 200);
        table.setModel(new BookController().daftarBuku());
        add(f);
        
        //
        //table.addRow(objData);
    }
}
