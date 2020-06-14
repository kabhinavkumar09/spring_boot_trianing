package com.abhi.ecommerse.service;

import com.abhi.ecommerse.model.User;

public interface UserService {
  
 public User findUserByEmail(String email);
 
 public void saveUser(User user);
}
