package com.tunisgtug.android.cuisinetunisienne.dao.entity;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Ingredient
 *
 */
@Entity

public class Ingredient implements Serializable {

	   
	@Id
	private long ingid;
	private String ingname;
	private static final long serialVersionUID = 1L;

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
