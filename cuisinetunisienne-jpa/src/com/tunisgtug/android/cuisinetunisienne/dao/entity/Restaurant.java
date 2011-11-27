package com.tunisgtug.android.cuisinetunisienne.dao.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import com.tunisgtug.android.cuisinetunisienne.dao.entity.Menu;
import java.util.Collection;
import java.util.ArrayList;
import javax.persistence.OneToMany;

@Entity
public class Restaurant {

	@Id
	private long resid;
	
	private String resname;
	
	private String ambiances;
	
	private String address;
	
	private Date sincedate;
	
	private int resrating;

	private boolean homedelivery;
	
	private Date servicefrom;
	
	private Date serviceto;

	@OneToMany
	private Collection<Menu> listMenu = new ArrayList<Menu>();
	
	
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

	public void setSincedate(Date param) {
		this.sincedate = param;
	}

	public Date getSincedate() {
		return sincedate;
	}

	public void setResrating(int param) {
		this.resrating = param;
	}

	public int getResrating() {
		return resrating;
	}

	public boolean getHomedelivery() {
		return this.homedelivery;
	}

	public void setHomedelivery(boolean homedelivery) {
		this.homedelivery = homedelivery;
	}
	
	public Date getServicefrom() {
		return this.servicefrom;
	}

	public void setServicefrom(Date servicefrom) {
		this.servicefrom = servicefrom;
	}
	
	public Date getServiceto() {
		return this.serviceto;
	}

	public void setServiceto(Date serviceto) {
		this.serviceto = serviceto;
	}

	public Collection<Menu> getListMenu() {
	    return listMenu;
	}

	public void setListMenu(Collection<Menu> param) {
	    this.listMenu = param;
	}
   
}