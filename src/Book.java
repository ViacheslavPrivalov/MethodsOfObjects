import java.util.Objects;

public class Book {
    private String bookName;
    private Author author;
    private int publishingYear;

    public Book(String bookName, Author author, int publishingYear) {
        this.bookName = bookName;
        this.author = author;
        this.publishingYear = publishingYear;
    }

    public String getBookName() {

        return this.bookName;
    }

    public Author getAuthor() {

        return this.author;
    }

    public int getPublishingYear() {

        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear) {

        this.publishingYear = publishingYear;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null || this.getClass() != other.getClass()) {
            return false;
        }
        Book book = (Book) other;
        return Objects.equals(bookName, book.bookName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(bookName);
    }

    @Override
    public String toString() {
        return "Книга: " + "\"" + this.bookName + "\"" + ", " + this.author + ", " + this.publishingYear;
    }
}

