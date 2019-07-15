package com.ejemplos.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplos.spring.model.User;
import com.ejemplos.spring.repositorio.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repository;

	@Override
	public User create(User user) {
		return repository.save(user);
	}

	@Override
	public User deleteById(int id) {
		User user = findById(id);
		if (user != null) {
			repository.delete(user);
		}
		return user;
	}

	@Override
	public List<User> findAll() {
		return repository.findAll();
	}

	// Cuidado. Esto era pre Spring JPA
	//Lo han hecho porque no exsite findOne y lo han sustituido
	/*
	@Override
	public User findById(int id) {
		return repository.findOne(id);
	}
	*/
	
	@Override
	public User findById(int id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public User update(User user) {
		return repository.save(user);
	}
}
