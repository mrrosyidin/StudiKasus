package entities;

public class AbstractBook {
    protected String tittle;
    protected String code;
    protected String author;
    protected String publisher;

    public AbstractBook(String tittle, String code, String author, String publisher) {
        this.tittle = tittle;
        this.code = code;
        this.author = author;
        this.publisher = publisher;
    }

}
