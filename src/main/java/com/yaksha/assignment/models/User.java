package com.yaksha.assignment.models;

public class User {
	private String name;
	private String email;

	// Constructor
	public User(String name, String email) {
		this.name = name;
		this.email = email;
	}

	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// Override toString for logging purposes
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + "]";
	}
}
