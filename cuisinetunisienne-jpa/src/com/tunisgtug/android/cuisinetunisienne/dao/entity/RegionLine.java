package com.tunisgtug.android.cuisinetunisienne.dao.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import com.tunisgtug.android.cuisinetunisienne.dao.entity.Region;
import javax.persistence.ManyToOne;
import com.tunisgtug.android.cuisinetunisienne.dao.entity.SimpleUser;

/**
 * Entity implementation class for Entity: RegionLine
 *
 */
@Entity
@IdClass(RegionLinePK.class)
public class RegionLine {

	   
	@Id
	private long regid;
	
	@Id
	private long userid;
	
	private int regRank;
	
	@ManyToOne
	private Region region;
	
	@ManyToOne
	private SimpleUser simpleUser;
	
	
	public RegionLine() {
		super();
	}
	
	
	public long getRegid() {
		return this.regid;
	}

	public void setRegid(long regid) {
		this.regid = regid;
	}   
	public long getUserid() {
		return this.userid;
	}

	public void setUserid(long userid) {
		this.userid = userid;
	}   
	public int getRegRank() {
		return this.regRank;
	}

	public void setRegRank(int regRank) {
		this.regRank = regRank;
	}
	public Region getRegion() {
	    return region;
	}
	public void setRegion(Region param) {
	    this.region = param;
	}
	public SimpleUser getSimpleUser() {
	    return simpleUser;
	}
	public void setSimpleUser(SimpleUser param) {
	    this.simpleUser = param;
	}
   
}
