package com.tunisgtug.android.cuisinetunisienne.dao.entity;


/**
 * ID class for entity: SortieLine
 *
 */ 
public class SortieLinePK {   
   
	         
	private int sorid;         
	private int platid;
	

	public SortieLinePK() {}


	public int getSorid() {
		return this.sorid;
	}

	public void setSorid(int sorid) {
		this.sorid = sorid;
	}
	

	public int getPlatid() {
		return this.platid;
	}

	public void setPlatid(int platid) {
		this.platid = platid;
	}
	
   
	/*
	 * @see java.lang.Object#equals(Object)
	 */	
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (!(o instanceof SortieLinePK)) {
			return false;
		}
		SortieLinePK other = (SortieLinePK) o;
		return true
			&& getSorid() == other.getSorid()
			&& getPlatid() == other.getPlatid();
	}
	
	/*	 
	 * @see java.lang.Object#hashCode()
	 */	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((int) (getSorid() ^ (getSorid() >>> 32)));
		result = prime * result + ((int) (getPlatid() ^ (getPlatid() >>> 32)));
		return result;
	}
   
   
}
