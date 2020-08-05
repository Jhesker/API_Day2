package com.tts.UsersAPI.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

@Entity
public class User {

	// Class level attributes there are what is defined to make up a whole User
	// Object.
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Length(max = 20, message = "First Name Must be less than 20 chartacters")
	private String firstName;
	
	@Length(min = 2, message = "Last Name Must be more than 2 chartacters")
	private String lastName;
	
	@Size(min = 4, max = 20, message = "Please enter in the full name of the state.")
	private String state;

	// My "Default" or empty constructor that is used by the JPA. Since we have the
	// @Entity tag we must have this in our code as well
	public User() {
	}

	// This is my AllArgs constructor is it used to create a User Object when all
	// the values are already available.
	public User(Long id, String firstName, String lastName, String state) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.state = state;
	}

	// my getters and setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", state=" + state + "]";
	}

}
