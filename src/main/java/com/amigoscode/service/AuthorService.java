package com.amigoscode.service;

import com.amigoscode.model.Author;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
  private static List<Author> authors =
      Arrays.asList(new Author(1, "Venky"), new Author(2, "Test"));

  public static Optional<Author> getAuthorById(Integer id) {
    return authors.stream().filter(a -> a.id().equals(id)).findFirst();
  }
}
