package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="usertable")
public class UserModel {
	@Id
	private int id;
	private String name;
	private int age;
	private String address;
	private String email;
	private int contact;
	public UserModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserModel(int id,String name, int age, String address, String email, int contact, String occupation,
			String review) {
		super();
		this.id=id;
		this.name = name;
		this.age = age;
		this.address = address;
		this.email = email;
		this.contact = contact;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
}
