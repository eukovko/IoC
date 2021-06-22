package com.kovko.runner;

import com.kovko.book.Book;
import com.kovko.reader.BookReader;

public class Main {
   public static void main(String[] args) {
      BookReader bookReader = new BookReader();
      Book book = new Book("fairy_tales.txt");
      bookReader.setBook(book);
      bookReader.read();
   }
}