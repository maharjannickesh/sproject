package com.nick.project.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;


@Entity
public class User implements Serializable {
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -5296535117883502394L;

	@Id
	private Integer id;
	
	@Size(min = 3, message = "First Name must be more than 2 Character")
	private String firstName;
	
	@Size(min = 3, message = "Last Name must be more than 2 Character")
	private String lastName;
	
	@Email(message = "Invalid Email Address")
	@Column(unique = true)
	private String email;
	
	@Size(min = 6, message = "Password must be more than 5 character")
	private String password;
	
	
	private String optionalText;
	
	private Boolean enabled;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getOptionalText() {
		return optionalText;
	}

	public void setOptionalText(String optionalText) {
		this.optionalText = optionalText;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	
	

}
