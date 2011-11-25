package com.tunisgtug.android.cuisinetunisienne.dao.entity;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Specialty
 *
 */
@Entity

public class Specialty implements Serializable {

	   
	@Id
	private int spcid;
	private String spcname;
	private boolean homedelivery;
	private static final long serialVersionUID = 1L;

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
	public boolean getHomedelivery() {
		return this.homedelivery;
	}

	public void setHomedelivery(boolean homedelivery) {
		this.homedelivery = homedelivery;
	}
   
}
