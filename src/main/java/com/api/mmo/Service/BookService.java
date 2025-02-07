package com.api.mmo.Service;

import com.api.mmo.Entity.BookEntity;
import com.api.mmo.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public List<BookEntity> getBooks(Long bookId){
        return bookRepository.findAll();
    }

    public Optional<BookEntity> GetBooks(Long id){
        return bookRepository.findById(id);
    }

    public BookEntity saveActu(BookEntity bookEntity){
        return bookRepository.save(bookEntity);
    }

    public void Delete(Long id) {

    }

    public void delete(Long bookId) {
    }

    public List<BookEntity> getBooks() {
        return null;
    }
}
