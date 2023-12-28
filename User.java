package com.web.model;

public class User {
	private String name;
	private String password;
	private String email;
	private long mno;
	private String address;
	public User() {
		super();
	}
	public User(String name, String password, String email, long mno, String address) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
		this.mno = mno;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public long getMno() {
		return mno;
	}
	public void setMno(long mno) {
		this.mno = mno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", email=" + email + ", mno=" + mno + ", address="
				+ address + "]";
	}
	
	

}
