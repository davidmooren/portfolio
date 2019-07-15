package com.ejemplos.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ejemplos.spring.model.User;

//Las basicas vienen implementadas ya
@Repository
public interface UserRepository extends JpaRepository<User,Integer>,UserRepositoryCustom {
}
