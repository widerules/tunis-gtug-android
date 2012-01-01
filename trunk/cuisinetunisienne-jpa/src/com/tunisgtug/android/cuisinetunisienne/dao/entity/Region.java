package com.tunisgtug.android.cuisinetunisienne.dao.entity;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.tunisgtug.android.cuisinetunisienne.dao.entity.RegionLine;

@Entity
public class Region {

	@Id
	@GeneratedValue
	private int regid;
	
	private String regname;
	
	@OneToMany
	private Collection<Restaurant> listRestaurant = new ArrayList<Restaurant>();

	@OneToMany(mappedBy = "region")
	private Collection<RegionLine> listCityzens = new ArrayList<RegionLine>();

	
	public Region() {
		super();
	}

	public int getRegid() {
		return regid;
	}

	public void setRegid(int id) {
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

	public Collection<RegionLine> getListCityzens() {
	    return listCityzens;
	}

	public void setListCityzens(Collection<RegionLine> param) {
	    this.listCityzens = param;
	}

}