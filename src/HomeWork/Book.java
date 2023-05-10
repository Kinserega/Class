package HomeWork;

public class Book {
    private String nameBook;
    private Author authorBook;
    private int jearBook;

    public Book(String nameBook, Author authorBook, int jearBook) {
        this.nameBook = nameBook;
        this.authorBook = authorBook;
        this.jearBook = jearBook;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public Author getAuthorBook() {
        return this.authorBook;
    }

    public int getJearBook() {
        return this.jearBook;
    }

    public void setJearBook(int jearBook) {
        this.jearBook = jearBook;
    }

}

