package com.springmvc.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;


// All of the validations used above are part of the JSR-303 API, 
// except for �NotEmpty� and �Email�, which are Hibernate-Validator annotations.
// JSR-349 es Beans 1.1 (Java EE 7) (la mejora de JSR-303)
// JSR 380: Bean Validation 2.0 (Java EE 8) en Sept-2017
//          support for the new date/time data types (JSR 310) for @Past and @Future
//          new built-in constraints: @Email, @NotEmpty, @NotBlank, @Positive, @PositiveOrZero, @Negative, @NegativeOrZero, @PastOrPresent and @FutureOrPresent

// Tambien se puede realizar con un fichero externo de validacion tal y como ves aqui
// https://examples.javacodegeeks.com/enterprise-java/spring/mvc/spring-mvc-form-handling-example/
// �pero no te parece mas chulo como lo hacemos aqui?

public class Student implements Serializable {

	private static final long serialVersionUID = 1L;

	@Size(min=3, max=30) 
	private String firstName;

	@Size(min=3, max=30)
		//import javax.validation.constraints.Min;
		//@Min(3) 
	    //import javax.validation.constraints.Max;
        //@Max(30)
	private String lastName;

	@NotEmpty
	private String sex;
	
	@DateTimeFormat(pattern="dd/MM/yyyy") 
	@Past @NotNull
	private Date dob;
	
	//Antonio.... y digo yo... ¿que diferencias hay entre @notnull y @notempty
	// https://www.javapedia.net/Hibernate-interview-questions/373
	//Y para los vagos
	// https://www.youtube.com/watch?v=0sPa8x6xwU8
	
	@Email @NotEmpty
	private String email;
	
	@NotEmpty
	private String section;
	
	@NotEmpty
	private String country;
	
	private boolean firstAttempt;
	
	@NotEmpty
	private List<String> subjects = new ArrayList<String>();

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public boolean isFirstAttempt() {
		return firstAttempt;
	}

	public void setFirstAttempt(boolean firstAttempt) {
		this.firstAttempt = firstAttempt;
	}

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Datos del estudiante\n\n [Nombre=" + firstName + ",\nApellidos=" + lastName
				+ ", sexo=" + sex + ",\nFecha de nacimiento=" + dob + ",\nemail=" + email
				+ ",\nTipo de estudios=" + section + ",\nPais=" + country
				+ ",\nNovato?=" + firstAttempt + ",\nMaterias=" + subjects
				+ "]";
	}
	
}

