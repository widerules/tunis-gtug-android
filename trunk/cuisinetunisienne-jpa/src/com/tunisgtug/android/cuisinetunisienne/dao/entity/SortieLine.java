package com.tunisgtug.android.cuisinetunisienne.dao.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import com.tunisgtug.android.cuisinetunisienne.dao.entity.Plat;

/**
 * Entity implementation class for Entity: SortieLine
 *
 */
@Entity
@IdClass(SortieLinePK.class)
public class SortieLine {
	   
	@Id
	private int sorid;
	
	@Id
	private int platid;
	
	private int quantity;
	
	private String description;
	
	private int platRank;
	
	@ManyToOne
	@PrimaryKeyJoinColumn
	private Sortie sortie;

	@ManyToOne
	@PrimaryKeyJoinColumn
	private Plat plat;
	
	
	public SortieLine() {
		super();
	}
	
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
	
	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getPlatRank() {
		return this.platRank;
	}

	public void setPlatRank(int rank) {
		this.platRank = rank;
	}

	public Sortie getSortie() {
	    return sortie;
	}

	public void setSortie(Sortie param) {
	    this.sortie = param;
	}

	public Plat getPlat() {
	    return plat;
	}

	public void setPlat(Plat param) {
	    this.plat = param;
	}
   
}
