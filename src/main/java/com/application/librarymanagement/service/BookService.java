package com.application.librarymanagement.service;

import com.application.librarymanagement.entity.Book;
import com.application.librarymanagement.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;
    public List<Book> findAllBooks(){
        return bookRepository.findAll();
    }

    public Book findAllBookById(Long id){
        Book book= bookRepository.findById(id).orElseThrow(() ->new RuntimeException("Book not found"));
        return book;
    }

    public void createBook(Book book){
        bookRepository.save(book);
    }

    public void updateBook(Book book){
        bookRepository.save(book);
    }


    public void deleteBook(Long id){
        Book book= bookRepository.findById(id).orElseThrow(() ->new RuntimeException("Book not found"));
        bookRepository.deleteById(book.getId());
    }

}
