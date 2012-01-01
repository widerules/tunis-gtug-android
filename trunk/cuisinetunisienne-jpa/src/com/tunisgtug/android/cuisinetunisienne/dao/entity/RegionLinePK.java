package com.tunisgtug.android.cuisinetunisienne.dao.entity;


/**
 * ID class for entity: RegionLine
 *
 */ 
public class RegionLinePK {
	         
	private int regid;
	
	private int userid;

	public RegionLinePK() {}


	public int getRegid() {
		return this.regid;
	}

	public void setRegid(int regid) {
		this.regid = regid;
	}
	

	public int getUserid() {
		return this.userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}
	
   
	/*
	 * @see java.lang.Object#equals(Object)
	 */	
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (!(o instanceof RegionLinePK)) {
			return false;
		}
		RegionLinePK other = (RegionLinePK) o;
		return true
			&& getRegid() == other.getRegid()
			&& getUserid() == other.getUserid();
	}
	
	/*	 
	 * @see java.lang.Object#hashCode()
	 */	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((int) (getRegid() ^ (getRegid() >>> 32)));
		result = prime * result + ((int) (getUserid() ^ (getUserid() >>> 32)));
		return result;
	}
   
   
}
