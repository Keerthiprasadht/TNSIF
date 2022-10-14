package com.tnsif.Vehicles;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="vehicle")
@Inheritance(strategy=InheritanceType.JOINED)	
public class Vehicle {
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int vid;
	private String vname;
	private int vmodel;
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public int getVmodel() {
		return vmodel;
	}
	public void setVmodel(int vmodel) {
		this.vmodel = vmodel;
	}
	
	
}