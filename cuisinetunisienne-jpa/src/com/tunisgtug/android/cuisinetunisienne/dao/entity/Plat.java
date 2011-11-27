package com.tunisgtug.android.cuisinetunisienne.dao.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import com.tunisgtug.android.cuisinetunisienne.dao.entity.Ingredient;
import java.util.Collection;
import java.util.ArrayList;
import javax.persistence.OneToMany;
import com.tunisgtug.android.cuisinetunisienne.dao.entity.Specialty;

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
	
	@OneToMany
	private Collection<Ingredient> listIngredient = new ArrayList<Ingredient>();
	
	@OneToMany
	private Collection<Specialty> specialty = new ArrayList<Specialty>();
	

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


	public Collection<Ingredient> getListIngredient() {
	    return listIngredient;
	}


	public void setListIngredient(Collection<Ingredient> param) {
	    this.listIngredient = param;
	}


	public Collection<Specialty> getSpecialty() {
	    return specialty;
	}


	public void setSpecialty(Collection<Specialty> param) {
	    this.specialty = param;
	}

}
