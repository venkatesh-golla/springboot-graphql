package com.amigoscode.service;

import com.amigoscode.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
  public User getUser(String id) {
    return new User(id, "venky");
  }
}
