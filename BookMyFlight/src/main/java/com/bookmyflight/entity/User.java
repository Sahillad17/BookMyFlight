package com.bookmyflight.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
@SequenceGenerator(name = "user_seq",sequenceName = "user_seq",initialValue = 1)
public class User {
	@Id
	@GeneratedValue(generator = "user_seq",strategy=GenerationType.SEQUENCE)
	@Column(name = "user_id")
	private int userId;
	private String username;
	private String password;
	private String email;
	private String firstName;
	private String lastName;
	private String phoneNo;
	private String address;
	
	

	public User() {
		// TODO Auto-generated constructor stub
	}



	public User(int userId, String username, String password, String email, String firstName, String lastName,
			String phoneNo, String address) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
		this.address = address;
	}



	public int getUserId() {
		return userId;
	}



	public void setUserId(int userId) {
		this.userId = userId;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
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



	public String getPhoneNo() {
		return phoneNo;
	}



	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNo=" + phoneNo + ", address="
				+ address + "]";
	}
	

}
