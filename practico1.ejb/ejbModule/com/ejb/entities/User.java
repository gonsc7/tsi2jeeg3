package com.ejb.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.Calendar;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: User
 *
 */
@Entity
@Table(name="Users")
public class User implements Serializable {

	
	private String name;
	private String lastName;   
	@Id
	private String nickName;
	private String password;
	private String email;
	private Calendar birthday;
	private String phone;
	private static final long serialVersionUID = 1L;

	public User() {
		super();
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}   
	public String getNickName() {
		return this.nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}   
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}   
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}   
	public Calendar getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Calendar birthday) {
		this.birthday = birthday;
	}   
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
   
}
