package com.api.mmo.Controllers;

import com.api.mmo.Entity.BookEntity;
import com.api.mmo.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/book")
public class BookController {
    @Autowired
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<BookEntity> getAll() {
        return bookService.getBooks();
    }

    @GetMapping("/{bookId}")
    public List<BookEntity> getById(@PathVariable("bookId") Long bookId) {
        return bookService.getBooks(bookId);
    }

    @PostMapping
    public void saveUpdate(@RequestBody() BookEntity book) {
        bookService.saveActu(book);
    }

    @DeleteMapping("{bookId}")
    public void deleteBook(@PathVariable("bookId") Long bookId) {
        bookService.delete(bookId);
    }
}
