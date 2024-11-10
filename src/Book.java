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


}

