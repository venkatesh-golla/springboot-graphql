package com.amigoscode.service;

import com.amigoscode.model.Book;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class BookService {
  private static List<Book> books =
      Arrays.asList(
          new Book(1, "test", 345, 1), new Book(2, "Maha", 400, 2), new Book(3, "cadbury", 345, 1));

  public static List<Book> getBooks() {
    return books;
  }

  public static Optional<Book> getBookById(Integer id) {
    return books.stream().filter(b -> b.id().equals(id)).findFirst();
  }
}
