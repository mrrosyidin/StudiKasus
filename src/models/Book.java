package models;

import java.util.ArrayList;

import entities.BookEntity;

public class Book {
    private static ArrayList<BookEntity> book = new ArrayList<>();

    public static void create(BookEntity nonfiksi){
        book.add(nonfiksi);
    }

    public static void update(BookEntity nonfiksi){
        try {
            book.set(indexOf(nonfiksi.getCode()), nonfiksi);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }

    public static void remove(String item){
        try {
            book.remove(indexOf(item));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }

    public static ArrayList<BookEntity> all(){
        return book;
    }

    public static BookEntity search(String item){
        for (BookEntity be : book){
            if (be.getCode().equals(item))
                return be;
            else if (be.getTittle().equals(item));
        }
        return null;
    }

    public static int indexOf(String code){
        BookEntity be = search(code);
        return book.indexOf(be);
    }
}
