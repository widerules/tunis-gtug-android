package com.tunisgtug.android.cuisinetunisienne.dao.entity;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.tunisgtug.android.cuisinetunisienne.dao.entity.Specialty;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: Plat
 *
 */
@Entity
public class Plat {

	@Id
	@GeneratedValue
	private int platid;
	
	@Column
	private String platname;

	@Column
	private String description;

	@Column
	private int calories;

	@Column
	private int platrating;

	@Column
	private int price;

	@Column
	private int preparationtime;
	
	@OneToMany
	private Collection<Ingredient> listIngredient = new ArrayList<Ingredient>();

	@ManyToOne
	private Specialty specialty;
	
	public Plat() {
		super();
	}
	
	
	public int getPlatid() {
		return this.platid;
	}

	public void setPlatid(int platid) {
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


	public Specialty getSpecialty() {
	    return specialty;
	}


	public void setSpecialty(Specialty param) {
	    this.specialty = param;
	}

}
