package com.tunisgtug.android.cuisinetunisienne.dao.entity;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.tunisgtug.android.cuisinetunisienne.dao.ientity.IRegion;
import com.tunisgtug.android.cuisinetunisienne.dao.entity.Restaurant;
import java.util.Collection;
import java.util.ArrayList;
import javax.persistence.OneToMany;

@Entity(name = "Region")
public class Region implements IRegion {

	@Id
	private long regid;
	@Basic
	private String regname;
	@OneToMany
	private Collection<Restaurant> restaurant = new ArrayList<Restaurant>();
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

	public Collection<Restaurant> getRestaurant() {
	    return restaurant;
	}

	public void setRestaurant(Collection<Restaurant> param) {
	    this.restaurant = param;
	}

}