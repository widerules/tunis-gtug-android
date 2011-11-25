package com.tunisgtug.android.cuisinetunisienne.dao.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: Ingredient
 *
 */
@Entity
public class Ingredient {

	@Id
	private long ingid;
	
	private String ingname;

	
	public Ingredient() {
		super();
	}
	
	public long getIngid() {
		return this.ingid;
	}

	public void setIngid(long ingid) {
		this.ingid = ingid;
	}   
	public String getIngname() {
		return this.ingname;
	}

	public void setIngname(String ingname) {
		this.ingname = ingname;
	}
   
}
