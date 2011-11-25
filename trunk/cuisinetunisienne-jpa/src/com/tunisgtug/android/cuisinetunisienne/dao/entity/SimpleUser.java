package com.tunisgtug.android.cuisinetunisienne.dao.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: SimpleUser
 *
 */
@Entity
public class SimpleUser {

	@Id
	private long userid;
	private String password;
	private String username;
	private String firstname;
	private String address;
	private String email;
	private Date membershipdate;


	public SimpleUser() {
		super();
	}
	
	
	public long getUserid() {
		return this.userid;
	}

	public void setUserid(long userid) {
		this.userid = userid;
	}   
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}   
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}   
	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}   
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}   
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}   
	public Date getMembershipdate() {
		return this.membershipdate;
	}

	public void setMembershipdate(Date membershipdate) {
		this.membershipdate = membershipdate;
	}   

}
