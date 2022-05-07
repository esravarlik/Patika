package com.company;


import com.sun.source.tree.Tree;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        TreeSet<Book> books = new TreeSet<>();
        books.add(new Book("Dune","Frank Herbert",712,1965));
        books.add(new Book("Red Rising","Pierce Brown",448,2014));
        books.add(new Book("Animal Farm","George Orwell",152,1945));
        books.add(new Book("Morning Star","Pierce Brown",518,2016));
        books.add(new Book("Golden Son","Pierce Brown",464,2015));

        System.out.println("Alphabet Order; ");
        System.out.println("------------------");
        for(Book book: books){
            System.out.println(book.getBookName() + book.getAuthorName() + book.getPageNumber() + book.getReleaseDate());
        }

        TreeSet<Book> bookPage = new TreeSet<>(new Comparator<Book>() {

            @Override
            public int compare(Book book1, Book book2) {
                return (book1.getPageNumber() - book2.getPageNumber());
            }
        });

        bookPage.add(new Book("Dune","Frank Herbert",712,1965));
        bookPage.add(new Book("Red Rising","Pierce Brown",448,2014));
        bookPage.add(new Book("Animal Farm","George Orwell",152,1945));
        bookPage.add(new Book("Morning Star","Pierce Brown",518,2016));
        bookPage.add(new Book("Golden Son","Pierce Brown",464,2015));

        System.out.println("Page Number Order;");
        System.out.println("------------------");
        for(Book book: bookPage){
            System.out.println(book.getBookName() + book.getAuthorName() + book.getPageNumber() + book.getReleaseDate());
        }
    }
}
