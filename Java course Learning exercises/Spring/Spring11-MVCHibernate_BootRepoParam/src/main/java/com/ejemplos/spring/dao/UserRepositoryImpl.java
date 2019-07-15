package com.ejemplos.spring.dao;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ejemplos.spring.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
@Transactional(readOnly = true)
public class UserRepositoryImpl implements UserRepositoryCustom {

	@PersistenceContext 
	EntityManager entityManager;
	 
	 //Para entender un ejemplo de como se pueden hacer funciones personalizadas
	@Override
	public List<User> getFirstNamesLike(String username) {
		Query query = entityManager.createNativeQuery("SELECT em.* FROM spring_data_jpa_example.username as em " +
                "WHERE em.username LIKE ?", User.class);
        query.setParameter(1, username + "%");
        return query.getResultList();
	}

}
