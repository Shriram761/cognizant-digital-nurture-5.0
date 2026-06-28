package org.library.service;

import org.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class BookService {


    private BookRepository bookRepository;
    BookService(){
        System.out.println("Book Service Constructor");
    }

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public BookRepository getBookRepository() {
        return bookRepository;
    }

    public void runService(){
        System.out.println("Book Service is running");
        System.out.println("__________________");
        bookRepository.runRepo();
        System.out.println("__________________");
    }

}
