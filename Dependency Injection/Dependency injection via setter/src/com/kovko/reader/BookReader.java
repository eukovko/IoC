package com.kovko.reader;

import com.kovko.book.Book;

public class BookReader {

    private Book book;

    public BookReader() {
    }

    public void read() {
        if (book != null) {
            System.out.println(book.getText());
        } else {
            System.out.println("What book do you want me to read?");
        }
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
