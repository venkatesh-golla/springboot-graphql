package com.amigoscode.controller;

import com.amigoscode.model.User;
import com.amigoscode.service.UserService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @QueryMapping
  public User user(@Argument String id) {
    return userService.getUser(id);
  }
}
