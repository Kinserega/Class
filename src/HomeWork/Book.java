package HomeWork;

public class Book {
    private String nameBook;
    private String authorBook;
    private int jearBook;

    public Book(String nameBook, String authorBook, int jearBook) {
        this.nameBook = nameBook;
        this.authorBook = authorBook;
        this.jearBook = jearBook;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public String getAuthorBook() {
        return this.authorBook;
    }

    public int getJearBook() {
        return this.jearBook;
    }

    public void setJearBook(int jearBook) {
        this.jearBook = jearBook;
    }

}

