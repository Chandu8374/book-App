package com.books.book_App.Controller;

import com.books.book_App.Model.Book;
import com.books.book_App.Service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/get")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @PostMapping("/save")
    public Book save(@RequestBody Book book){
        return bookService.save(book);
    }
}
