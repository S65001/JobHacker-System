package org.example;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private int id;
    private List<Book> borrowedBooks=new ArrayList<>();

    public User(String name, int id, List<Book> borrowedBooks) {
        this.name = name;
        this.id = id;
        this.borrowedBooks = borrowedBooks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }
    public void addBorrowedBook(Book book){
        borrowedBooks.add(book);
    }
    public void removeBorrowedBook(Book book){
        borrowedBooks.remove(book);
    }
}
