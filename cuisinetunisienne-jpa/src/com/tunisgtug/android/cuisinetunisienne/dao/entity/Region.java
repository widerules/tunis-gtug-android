package com.tunisgtug.android.cuisinetunisienne.dao.entity;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Region {

	@Id
	private long regid;
	
	@Basic
	private String regname;
	
	@OneToMany
	private Collection<Restaurant> listRestaurant = new ArrayList<Restaurant>();
	
	
	public long getRegid() {
		return regid;
	}

	public void setRegid(long id) {
		this.regid = id;
	}

	public void setRegname(String param) {
		this.regname = param;
	}

	public String getRegname() {
		return regname;
	}

	public Collection<Restaurant> getListRestaurant() {
	    return listRestaurant;
	}

	public void setListRestaurant(Collection<Restaurant> param) {
	    this.listRestaurant = param;
	}

	public Region() {
		super();
	}

}