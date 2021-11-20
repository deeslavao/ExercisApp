package com.heracles.net.user;

import java.time.LocalDate;
import java.util.UUID;

public class User {
	
	private UUID id;
	private String name;			// Se debe ingresar primero los nombre y continuo los apellidos
	private LocalDate dateOfBirth;
	private String email;
	private String userName;
	private String password;
	private float weight;
	private float height;

	public User() {
	}

	public User(String name, LocalDate dateOfBirth, String email, String userName, String password,
			float weight, float height) {
		this.id = UUID.randomUUID();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		this.userName = userName;
		this.password = password;
		this.weight = weight;
		this.height = height;
	}

	public UUID getId() {
		return this.id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateOfBirth() {
		return this.dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public float getWeight() {
		return this.weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getHeight() {
		return this.height;
	}

	public void setHeight(float height) {
		this.height = height;
	}
	
}