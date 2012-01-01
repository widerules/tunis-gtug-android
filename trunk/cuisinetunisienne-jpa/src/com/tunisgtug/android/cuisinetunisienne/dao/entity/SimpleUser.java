package com.tunisgtug.android.cuisinetunisienne.dao.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.tunisgtug.android.cuisinetunisienne.dao.entity.RegionLine;

/**
 * Entity implementation class for Entity: SimpleUser
 *
 */
@Entity
public class SimpleUser {

	@Id
	@GeneratedValue
	private int userid;
	
	private String password;
	
	private String username;
	
	private String firstname;
	
	private String address;
	
	private String email;
	
	private Date membershipdate;
	
	@OneToMany(mappedBy = "simpleUser")
	private Collection<UserLine> listSortie = new ArrayList<UserLine>();

	@OneToMany(mappedBy = "simpleUser")
	private Collection<RegionLine> listRegion = new ArrayList<RegionLine>();

	
	public SimpleUser() {
		super();
	}
	
	
	public int getUserid() {
		return this.userid;
	}

	public void setUserid(int userid) {
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


	public Collection<UserLine> getListSortie() {
	    return listSortie;
	}


	public void setListSortie(Collection<UserLine> param) {
	    this.listSortie = param;
	}


	public Collection<RegionLine> getListRegion() {
	    return listRegion;
	}


	public void setListRegion(Collection<RegionLine> param) {
	    this.listRegion = param;
	}   

}
