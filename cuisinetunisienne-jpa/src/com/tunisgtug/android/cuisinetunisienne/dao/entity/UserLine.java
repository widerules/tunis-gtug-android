package com.tunisgtug.android.cuisinetunisienne.dao.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.PrimaryKeyJoinColumn;

import com.tunisgtug.android.cuisinetunisienne.dao.entity.Sortie;
import javax.persistence.ManyToOne;
import com.tunisgtug.android.cuisinetunisienne.dao.entity.SimpleUser;

/**
 * Entity implementation class for Entity: UserLine
 *
 */
@Entity

@IdClass(UserLinePK.class)
public class UserLine {
	   
	@Id
	private long userid;
	
	@Id
	private long sorid;
	
	private Date addedDate;
	
	private boolean organizer;

	@ManyToOne
	@PrimaryKeyJoinColumn
	private Sortie sortie;

	@ManyToOne
	@PrimaryKeyJoinColumn
	private SimpleUser simpleUser;

	
	public UserLine() {
		super();
	}
	
	
	public long getUserid() {
		return this.userid;
	}

	public void setUserid(long userid) {
		this.userid = userid;
	}
	
	public long getSorid() {
		return this.sorid;
	}

	public void setSorid(long sorid) {
		this.sorid = sorid;
	}
	
	public Date getAddedDate() {
		return this.addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}
	
	public boolean getOrganizer() {
		return this.organizer;
	}

	public void setOrganizer(boolean organizer) {
		this.organizer = organizer;
	}


	public Sortie getSortie() {
	    return sortie;
	}


	public void setSortie(Sortie param) {
	    this.sortie = param;
	}


	public SimpleUser getSimpleUser() {
	    return simpleUser;
	}


	public void setSimpleUser(SimpleUser param) {
	    this.simpleUser = param;
	}
   
}
