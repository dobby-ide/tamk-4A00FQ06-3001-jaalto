//        Requirements for the Book class:
//
//        - constructor(), constructor(<all params>)
//        - get(), set()
//        - Book name
//        - Author
//        - ISBN
//        - Published year
//        - Publisher
//        - print()

public class Book {

    private String bookName;
    private String author;
    private String isbn;
    private String publishedYear;
    private String publisher;
    public Book(){
        this.bookName="unkown";
        this.author = "unkown";
        this.isbn = "unkown";
        this.publishedYear = "unkown";
        this.publisher = "unkown";
    };
    public Book(String bookName, String author, String isbn, String publishedYear, String publisher) {
        this.bookName = bookName;
        this.author = author;
        this.isbn = isbn;
        this.publishedYear = publishedYear;
        this.publisher = publisher;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(String publishedYear) {
        this.publishedYear = publishedYear;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", publishedYear='" + publishedYear + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
