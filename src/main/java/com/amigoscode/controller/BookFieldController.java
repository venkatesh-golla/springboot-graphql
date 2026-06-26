package com.amigoscode.controller;

import com.amigoscode.model.Author;
import com.amigoscode.model.Book;
import com.amigoscode.service.AuthorService;
import java.util.Optional;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
public class BookFieldController {
  private final AuthorService authorService;

  public BookFieldController(AuthorService authorService) {
    this.authorService = authorService;
  }

  @SchemaMapping
  public Optional<Author> author(Book book) {
    return authorService.getAuthorById(book.authorId());
  }
}
