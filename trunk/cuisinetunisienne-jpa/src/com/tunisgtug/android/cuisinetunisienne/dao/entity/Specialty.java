package com.tunisgtug.android.cuisinetunisienne.dao.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import com.tunisgtug.android.cuisinetunisienne.dao.entity.Region;
import java.util.Collection;
import java.util.ArrayList;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Specialty
 *
 */
@Entity
public class Specialty {

	@Id
	private long spcid;
	
	private String spcname;

	@OneToMany
	private Collection<Region> region = new ArrayList<Region>();
	
	
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


	public Collection<Region> getRegion() {
	    return region;
	}


	public void setRegion(Collection<Region> param) {
	    this.region = param;
	}
}
