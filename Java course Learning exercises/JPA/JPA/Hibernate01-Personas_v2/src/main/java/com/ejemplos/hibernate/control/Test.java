package com.ejemplos.hibernate.control;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ejemplos.hibernate.model.Persona;
import com.ejemplos.hibernate.util.HibernateUtils;
import com.ejemplos.hibernate.util.JdbcUtils;

import com.ejemplos.hibernate.util.Simulaciones;

/**
 * @author: Antonio
 *
 */

public class Test {

	public static void main(String[] args) {
		
		// Comprobacion
        JdbcUtils.ejecutaQuery("select * from persona");
		
		//OBJETOS DE PRUEBA
		Persona p1 = new Persona("Antonio","Santos"+ Simulaciones.sufijoNombre());
        System.out.println(p1);
        
        Persona p2 = new Persona("Bill","Gates"+ Simulaciones.sufijoNombre());
        System.out.println(p2); 
        
        //Operaciones en BBDD

        Session session = HibernateUtils.getSession();
        Transaction tx = null;
        
        try {
            tx = session.beginTransaction();

            session.save(p1);
            session.save(p2);            

            tx.commit();

        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println(e.getMessage());
            e.getMessage();
        } finally {
            session.close();
        }
        
        // Comprobacion
        JdbcUtils.ejecutaQuery("select * from persona");

	}

}
