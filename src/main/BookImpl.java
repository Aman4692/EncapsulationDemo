package main;

import data.Book;

public class BookImpl {

    public static void main(String[] args) {

        Book book = new Book();
        book.setTitle("Math");
        book.setName("Sample");
        book.setISBN(1234431123);
        book.setPrice(300);
        book.setYear(2022);
        System.out.println(book.getTitle());
        System.out.println(book.getISBN());
        System.out.println(book.getName());
        System.out.println(book.getPrice());
        System.out.println(book.getYear());
    }
}
