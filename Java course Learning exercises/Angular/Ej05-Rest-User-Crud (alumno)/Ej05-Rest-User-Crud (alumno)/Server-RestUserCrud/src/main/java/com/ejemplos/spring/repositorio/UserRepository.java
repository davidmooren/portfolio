package com.ejemplos.spring.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ejemplos.spring.model.User;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	/*
	void delete(User user);

	List<User> findAll();

	User findOne(int id);

	User save(User user);*/
}
