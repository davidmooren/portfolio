package com.ejemplos.spring.service;

import java.util.List;
import java.util.Optional;

import com.ejemplos.spring.model.User;

public interface UserService {

	User create(User user);

	User deleteById(int id);

	List<User> findAll();

	User findById(int id);

	User update(User user);
}
