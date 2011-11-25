package com.tunisgtug.android.cuisinetunisienne.dao.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: Specialty
 *
 */
@Entity
public class Specialty {

	@Id
	private long spcid;
	
	private String spcname;
	
	
	public Specialty() {
		super();
	}
	
	
	public long getSpcid() {
		return this.spcid;
	}

	public void setSpcid(long spcid) {
		this.spcid = spcid;
	}
	
	public String getSpcname() {
		return this.spcname;
	}

	public void setSpcname(String spcname) {
		this.spcname = spcname;
	}
}
