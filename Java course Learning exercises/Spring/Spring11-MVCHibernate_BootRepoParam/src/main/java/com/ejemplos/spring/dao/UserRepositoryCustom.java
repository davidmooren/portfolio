package com.ejemplos.spring.dao;

import java.util.List;

import com.ejemplos.spring.model.User;

//Es obligatorio que añadan Custom al final
//Lo usaremos para metodos fuera de los estandares
public interface UserRepositoryCustom {
	
	List<User> getFirstNamesLike(String username);

}
