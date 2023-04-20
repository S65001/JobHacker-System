package org.example;

public class Book {
    private int book_id;
    private String author;
    private String title;
    private int version;
    private boolean isAvailable;

    public Book(int book_id, String author, String title, int version, boolean isAvailable) {
        this.book_id = book_id;
        this.author = author;
        this.title = title;
        this.version = version;
        this.isAvailable = isAvailable;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Book{" +
                "book_id=" + book_id +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", version=" + version +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
