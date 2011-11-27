package com.tunisgtug.android.cuisinetunisienne.dao.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import com.tunisgtug.android.cuisinetunisienne.dao.entity.Plat;
import java.util.Collection;
import java.util.ArrayList;
import javax.persistence.OneToMany;
import com.tunisgtug.android.cuisinetunisienne.dao.entity.Specialty;

/**
 * Entity implementation class for Entity: Menu
 *
 */
@Entity
public class Menu {

	@Id
	private long menuid;
	
	private String menuname;
	
	private int menurating;
	
	private int totalprice;
	
	@OneToMany
	private Collection<Plat> listPlat = new ArrayList<Plat>();
	
	@OneToMany
	private Collection<Specialty> specialty = new ArrayList<Specialty>();
	
	
	public Menu() {
		super();
	}
	
	
	public long getMenuid() {
		return this.menuid;
	}

	public void setMenuid(long menuid) {
		this.menuid = menuid;
	}
	
	public String getMenuname() {
		return this.menuname;
	}

	public void setMenuname(String menuname) {
		this.menuname = menuname;
	}
	
	public int getMenurating() {
		return this.menurating;
	}

	public void setMenurating(int menurating) {
		this.menurating = menurating;
	}
	
	public int getTotalprice() {
		return this.totalprice;
	}

	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}


	public Collection<Plat> getListPlat() {
	    return listPlat;
	}


	public void setListPlat(Collection<Plat> param) {
	    this.listPlat = param;
	}


	public Collection<Specialty> getSpecialty() {
	    return specialty;
	}


	public void setSpecialty(Collection<Specialty> param) {
	    this.specialty = param;
	}
   
}
