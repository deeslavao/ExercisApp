package com.heracles.net.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import java.time.LocalDate;
import java.util.UUID;

@Entity(name = "User")
@Table(
	name = "users",
	uniqueConstraints = {
		@UniqueConstraint(name = "user_email_unique", columnNames = "email"),
		@UniqueConstraint(name = "user_nick_name_unique", columnNames = "nick_name")
	}
)
public class User {
	
	@Id
	@Column(
		name = "id",
		columnDefinition = "uuid DEFAULT uuid_generate_v4()",
		unique = true,
		nullable = false
	)
	private UUID id;
	@Column(
		name = "name",
		nullable = false,
		updatable = false,
		columnDefinition = "TEXT"
	)
	private String name; // Se debe ingresar primero los nombre y continuo los apellidos
	@Column(
		name = "data_of_birth",
		updatable = false,
		nullable = false
	)
	private LocalDate dateOfBirth;
	@Column(
		name = "email",
		nullable = false
	)
	private String email;
	@Column(
		name = "nick_name",
		nullable = false
	)
	private String nickName;
	@Column(
		name = "password",
		nullable = false,
		columnDefinition = "TEXT"
	)
	private String password;
	@Column(
		name = "weight",
		precision = 3,
		updatable = true
	)
	private float weight;
	@Column(
		name = "height",
		precision = 3,
		updatable = true
	)
	private float height;

	public User() {
	}

	public User(String name, LocalDate dateOfBirth, String email, String userName, String password,
			float weight, float height) {
		this.id = UUID.randomUUID();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		this.nickName = userName;
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
		return this.nickName;
	}

	public void setUserName(String userName) {
		this.nickName = userName;
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