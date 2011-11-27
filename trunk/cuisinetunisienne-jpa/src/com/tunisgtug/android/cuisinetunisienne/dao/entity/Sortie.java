package com.tunisgtug.android.cuisinetunisienne.dao.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Sortie
 *
 */
@Entity
public class Sortie {

	@Id
	private int sorid;
	
	private String description;
	
	private String address;
	
	private Date startdate;
	
	private Date enddate;
	
	private int sorrating;
	
	@OneToMany(mappedBy = "sortie")
	private Collection<SortieLine> listPlats = new ArrayList<SortieLine>();

	@OneToMany(mappedBy = "sortie")
	private Collection<UserLine> listParticipants = new ArrayList<UserLine>();

	
	public Sortie() {
		super();
	}
	
	public int getSorid() {
		return this.sorid;
	}

	public void setSorid(int sorid) {
		this.sorid = sorid;
	}
	
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public Date getStartdate() {
		return this.startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	
	public Date getEnddate() {
		return this.enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	
	public int getSorrating() {
		return this.sorrating;
	}

	public void setSorrating(int sorrating) {
		this.sorrating = sorrating;
	}

	public Collection<SortieLine> getListPlats() {
	    return listPlats;
	}

	public void setListPlats(Collection<SortieLine> param) {
	    this.listPlats = param;
	}

	public Collection<UserLine> getListParticipants() {
	    return listParticipants;
	}

	public void setListParticipants(Collection<UserLine> param) {
	    this.listParticipants = param;
	}
   
}
