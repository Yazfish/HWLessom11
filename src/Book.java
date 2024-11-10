import java.util.Objects;

public class Book {
    private Author author;
    private String bookTitle;
    private int yearOfPublication;

    public Book(Author author, String bookTitle, int yearOfPublication) {
        this.author = author;
        this.bookTitle = bookTitle;
        this.yearOfPublication = yearOfPublication;
    }

    public Author getAuthor() {
        return author;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublication == book.yearOfPublication && Objects.equals(author, book.author)
                && Objects.equals(bookTitle, book.bookTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, bookTitle, yearOfPublication);
    }

    @Override
    public String toString() {
        return "Автор: " + author + ", Название: "
                + bookTitle + ", Год издания: " + yearOfPublication;
    }
}


