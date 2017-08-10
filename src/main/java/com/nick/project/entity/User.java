package com.nick.project.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Generated;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


@Entity
@Table(name = "user", schema = "spdba")
//@ComponentScan("com.nick.project.entity")
public class User implements Serializable {
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -5296535117883502394L;

	@Id
	@GeneratedValue
	@Column(name = "userid")
	private Integer id;
	
	@Size(min = 3, message = "First Name must be more than 2 Character")
	@Column(name = "firstname")
	private String firstName;
	
	@Size(min = 3, message = "Last Name must be more than 2 Character")
	@Column(name = "lastname")
	private String lastName;
	
	@Email(message = "Invalid Email Address")
	@Column(unique = true, name= "email")
	private String email;
	
	@Size(min = 6, message = "Password must be more than 5 character")
	@Column(name = "password")
	private String password;
	
	@Column(name = "optionaltext")
	private String optionalText;
	
	@Column(name = "enabled")
	private Boolean enabled;

	@Column(name = "addby")
	private String addedBy; 
	
	@Column(name = "addedtime")
	private String addedTime;
	
	@Column(name = "updateby")
	private String updatedBy;
	
	@Column(name = "updatedtime")
	private String updatedTime;
	
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

    public String getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(String addedBy) {
        this.addedBy = addedBy;
    }

    public String getAddedTime() {
        return addedTime;
    }

    public void setAddedTime(String addedTime) {
        this.addedTime = addedTime;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }
	
	

}
