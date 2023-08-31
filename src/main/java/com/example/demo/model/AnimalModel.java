package com.example.demo.model;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
//import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="pettable")
public class AnimalModel {
	@Id
	private int animalid;
    private String animalname;
    private String animalspecies;
    private String animalcolor;
    private String gender;
    private int weight;
    private int age;
    private String features;
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name="id")
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="animalid")
    
    
	private List<UserModel> um;

	public AnimalModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AnimalModel(int animalid, String animalname, String animalspecies, String animalcolor, String gender,
			int weight, int age, String features, List<UserModel> um) {
		super();
		this.animalid = animalid;
		this.animalname = animalname;
		this.animalspecies = animalspecies;
		this.animalcolor = animalcolor;
		this.gender = gender;
		this.weight = weight;
		this.age = age;
		this.features = features;
		this.um = um;
	}

	public int getAnimalid() {
		return animalid;
	}

	public void setAnimalid(int animalid) {
		this.animalid = animalid;
	}

	public String getAnimalname() {
		return animalname;
	}

	public void setAnimalname(String animalname) {
		this.animalname = animalname;
	}

	public String getAnimalspecies() {
		return animalspecies;
	}

	public void setAnimalspecies(String animalspecies) {
		this.animalspecies = animalspecies;
	}

	public String getAnimalcolor() {
		return animalcolor;
	}

	public void setAnimalcolor(String animalcolor) {
		this.animalcolor = animalcolor;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFeatures() {
		return features;
	}

	public void setFeatures(String features) {
		this.features = features;
	}

	public List<UserModel> getUm() {
		return um;
	}

	public void setUm(List<UserModel> um) {
		this.um = um;
	}
	
}
