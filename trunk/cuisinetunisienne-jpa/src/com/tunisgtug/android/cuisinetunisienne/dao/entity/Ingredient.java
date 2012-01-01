package com.tunisgtug.android.cuisinetunisienne.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: Ingredient
 *
 */
@Entity
public class Ingredient {

	@Id
	@GeneratedValue
	private int ingid;

	@Column
	private String ingname;

	
	public Ingredient() {
		super();
	}
	
	public int getIngid() {
		return this.ingid;
	}

	public void setIngid(int ingid) {
		this.ingid = ingid;
	}   
	public String getIngname() {
		return this.ingname;
	}

	public void setIngname(String ingname) {
		this.ingname = ingname;
	}
   
}
