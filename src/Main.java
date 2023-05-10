import HomeWork.Author;
import HomeWork.Book;

public class Main {
    public static void main(String[] args) {
        System.out.println("Классы");
        Author firstAuthor = new Author("Лев", " Толстой");
        Author secondAuthor = new Author("Федор", " Достаевский");

        Book firstBook = new Book("Война и мир", firstAuthor, 1862);
        Book secondBook = new Book("Белый ночи", secondAuthor, 1848);
        System.out.println("firstBook = " + firstBook.getNameBook() + ", " + firstBook.getAuthorBook() + ", " + firstBook.getJearBook());
        System.out.println("secondBook = " + secondBook.getNameBook() + ", " + secondBook.getAuthorBook() + ", " + secondBook.getJearBook());
        secondBook.setJearBook(1849);
        System.out.println("secondBook = " + secondBook.getNameBook() + ", " + secondBook.getAuthorBook() + ", " + secondBook.getJearBook());
    }
}