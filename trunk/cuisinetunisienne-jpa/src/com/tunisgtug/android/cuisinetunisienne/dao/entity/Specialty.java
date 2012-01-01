package com.tunisgtug.android.cuisinetunisienne.dao.entity;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Specialty
 *
 */
@Entity
public class Specialty {

	@Id
	@GeneratedValue
	private int spcid;
	
	private String spcname;

	@OneToMany
	private Collection<Region> region = new ArrayList<Region>();

	public Specialty() {
		super();
	}
	
	
	public int getSpcid() {
		return this.spcid;
	}

	public void setSpcid(int spcid) {
		this.spcid = spcid;
	}
	
	public String getSpcname() {
		return this.spcname;
	}

	public void setSpcname(String spcname) {
		this.spcname = spcname;
	}


	public Collection<Region> getRegion() {
	    return region;
	}


	public void setRegion(Collection<Region> param) {
	    this.region = param;
	}
}
