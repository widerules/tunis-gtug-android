package com.tunisgtug.android.cuisinetunisienne.dao.entity;


/**
 * ID class for entity: UserLine
 *
 */ 
public class UserLinePK {   
   
	         
	private int userid;
	
	private int sorid;

	
	public UserLinePK() {}
	

	public int getUserid() {
		return this.userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}
	

	public int getSorid() {
		return this.sorid;
	}

	public void setSorid(int sorid) {
		this.sorid = sorid;
	}
	
   
	/*
	 * @see java.lang.Object#equals(Object)
	 */	
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (!(o instanceof UserLinePK)) {
			return false;
		}
		UserLinePK other = (UserLinePK) o;
		return true
			&& getUserid() == other.getUserid()
			&& getSorid() == other.getSorid();
	}
	
	/*	 
	 * @see java.lang.Object#hashCode()
	 */	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((int) (getUserid() ^ (getUserid() >>> 32)));
		result = prime * result + ((int) (getSorid() ^ (getSorid() >>> 32)));
		return result;
	}
   
   
}
