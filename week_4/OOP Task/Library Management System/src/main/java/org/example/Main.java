package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Library library=new Library("vlibrary","z19");
        library.addBook(new Book(1,"ali","hello",6,true));
        library.addBook(new Book(-6,"ali","hello",5,false));
        library.addBook(new Book(1,"ali","hello",5,false));
        library.addBook(new Book(1,null,"hello",5,false));
        library.addBook(new Book(1,"ahmed",null,5,false));
        library.addBook(new Book(1,"ahmed",null,-3,false));
//        library.removeBook(1);
//        library.removeBook(2);
        library.addUser(new User("mohamed",1,new ArrayList<>()));
        library.checkoutBook(1,2);
        library.checkoutBook(1,1);
        library.checkoutBook(2,1);
        library.addBook(new Book(2,"mahmoud","kera",4,true));
        library.addBook(new Book(3,"marwan ","c++",7,true));
        library.addBook(new Book(4,"adel","java",9,false));
//        library.availableBooks();
//        library.borrowedBooks();
        library.displayBook(1);
        library.displayBook(2);
        library.displayBook(3);
        library.displayBook(4);
        library.displayBook(5);
    }
}