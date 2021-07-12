package com.company;

import java.util.ArrayList;

class Book{
    String book_name , book_author;
    public Book(String book_name , String book_author){
        this.book_author = book_author;
        this.book_name= book_name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "book_name='" + book_name + '\'' +
                ", book_author='" + book_author + '\'' +
                '}';
    }
}
class Library{
    public ArrayList<Book> boooks;
    public Library(ArrayList<Book> books){
        this.boooks = books;                   //Here we just store the books into the boooks arraylist .
    }
    public void addBook(Book book){         //it will take object of Book which will gonna be a book
        System.out.println("the book has been added");
        this.boooks.add(book);               //here boooks it a ARRAYLIST and book is an object so, we just add book
                                               // which will given by user and that book will add in boooks ARRAYLIST
    }
    public void issue_book(Book issuebook , String issuedto){
        System.out.println("Your book has been issued " + issuedto);
        this.boooks.remove(issuebook);
    }
    public void return_book(Book b){
        System.out.println("the book has been returned");
        this.boooks.add(b);
    }
}
public class Library_management_System {
    public static void main(String[] args) {

        ArrayList<Book> bk = new ArrayList<>();
       Book b1 =new Book("Algo","James");
        bk.add(b1);
        Book b2 =new Book("DSA","Lawiet");
        bk.add(b2);
        Book b3 =new Book("Django","CLRS");
        bk.add(b3);
        Book b4 =new Book("Genius of Genius","Parv");
        bk.add(b4);

        Library l = new Library(bk);

        l.addBook(new Book("sherlock homes" ,"Robert D."));
        System.out.println(bk);

        l.issue_book(b3,"Parv James");
        System.out.println(bk);

        l.return_book(b3);
        System.out.println(bk);
    }
}

/*
Create a library management system which is capable of issuing books to the students .
Books should have info like -:
1.Book name
2. Book author
3.Issued to
4.Issued on
 User should be able to add books , return books , issue books
 Assume that all the users are registered with their names in the central database
 */
