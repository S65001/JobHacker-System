package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Library {
    private String name;
    private String code;
    private List<Book> books=new ArrayList<>();
    private List<User> users=new ArrayList<>();

    public Library(String name, String code) {
        this.name = name;
        this.code = code;
    }
    public void addUser(User user){
        users.add(user);

    }

    public User getUser(int id){
        for (User user: users) {
            if(user.getId()==id)
                return user;
        }
        return null;
    }

    public void addBook(Book book){
        if(!books.contains(book) && book.getBook_id()>0 && book.getAuthor()!=null &&book.getTitle()!=null && book.getVersion()>0){
            for (Book b: books) {
                if(b.getBook_id()==book.getBook_id()) {
                    System.out.println("this id is already exists");
                    return;
                }
            }
            books.add(book);
            System.out.println("book added successfully");
        }else{

            System.out.println("invalid data");
        }

    }
    public void removeBook(int id){
        boolean isFound=false;
        if(!books.isEmpty()) {
            for (Book book : books) {
                if (book.getBook_id() == id) {
                    books.remove(book);
                    isFound = true;
                    System.out.println("book has been deleted successfully");
                    return;
                }
            }
        }
        if(!isFound)
            System.out.println("this book is not found");
    }
    public void checkoutBook(int bookId,int userId){
        boolean isFound=false;
        User user;
        for(Book book:books){
            if(book.getBook_id()==bookId){
                if(getUser(userId)!=null) {
                    user = getUser(userId);
                    user.addBorrowedBook(book);
                }else{
                    System.out.println("user not found");
                    return;
                }
                if(!book.isAvailable())
                    break;
                book.setAvailable(false);
                isFound=true;
                System.out.println("book "+bookId+" has been checked out");
                return;
            }
        }
        if(!isFound)
            System.out.println("book is not found");
    }
    public Book getBook(int id){
        for(Book book:books){
            if(book.getBook_id()==id){
                return book;
            }
        }
        return null;
    }

    public void availableBooks(){
        boolean available=false;
        if(!books.isEmpty()) {
            for (Book book : books) {
                if (book.isAvailable()) {
                    System.out.println(book.toString());
                    available=true;
                }
            }
            if(available)
                 return;
        }
        System.out.println("there is no available books");
    }
    public void borrowedBooks(){
        boolean available=false;
        if(!books.isEmpty()) {
            for (Book book : books) {
                if (!book.isAvailable()) {
                    System.out.println(book.toString());
                    available=true;
                }
            }
            if(available)
              return;
        }
        System.out.println("there is no borrowed books");
    }
    public void displayBook(int id){
        boolean isFound=false;
        for(Book book:books){
            if(book.getBook_id()==id){
                System.out.println(book.toString());
                isFound=true;
            }
        }
        if(!isFound)
            System.out.println("book is not found");
    }
}
