package com.tunisgtug.android.cuisinetunisienne.dao.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: Plat
 *
 */
@Entity
public class Plat {

	@Id
	private long platid;
	private String platname;
	private String description;
	private int calories;
	private int platrating;
	private int price;
	private int preparationtime;
	

	public Plat() {
		super();
	}
	
	
	public long getPlatid() {
		return this.platid;
	}

	public void setPlatid(long platid) {
		this.platid = platid;
	}
	
	public String getPlatname() {
		return this.platname;
	}

	public void setPlatname(String platname) {
		this.platname = platname;
	}
	
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getCalories() {
		return this.calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public int getPlatrating() {
		return platrating;
	}

	public void setPlatrating(int platrating) {
		this.platrating = platrating;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPreparationtime() {
		return preparationtime;
	}

	public void setPreparationtime(int preparationtime) {
		this.preparationtime = preparationtime;
	}

}
