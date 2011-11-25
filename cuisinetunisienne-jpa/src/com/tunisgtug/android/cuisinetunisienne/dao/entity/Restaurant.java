package com.tunisgtug.android.cuisinetunisienne.dao.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;

@Entity
public class Restaurant {

	@Id
	private long resid;
	
	private String resname;
	
	private String ambiances;
	
	private String address;
	
	@Temporal(javax.persistence.TemporalType.DATE)
	private String sincedate;
	
	private int resrating;

	
	public Restaurant() {
		super();
	}

	public long getResid() {
		return resid;
	}

	public void setResid(long id) {
		this.resid = id;
	}

	public void setResname(String param) {
		this.resname = param;
	}

	public String getResname() {
		return resname;
	}

	public void setAmbiances(String param) {
		this.ambiances = param;
	}

	public String getAmbiances() {
		return ambiances;
	}

	public void setAddress(String param) {
		this.address = param;
	}

	public String getAddress() {
		return address;
	}

	public void setSincedate(String param) {
		this.sincedate = param;
	}

	public String getSincedate() {
		return sincedate;
	}

	public void setResrating(int param) {
		this.resrating = param;
	}

	public int getResrating() {
		return resrating;
	}

}