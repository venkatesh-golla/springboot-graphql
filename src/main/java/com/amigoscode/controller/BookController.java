package com.amigoscode.controller;

import com.amigoscode.model.Book;
import com.amigoscode.service.BookService;
import java.util.List;
import java.util.Optional;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {
  private final BookService bookService;

  public BookController(BookService bookService) {
    this.bookService = bookService;
  }

  @QueryMapping
  public List<Book> books() {
    return bookService.getBooks();
  }

  @QueryMapping
  public Optional<Book> bookById(@Argument Integer id) {
    return bookService.getBookById(id);
  }
}
