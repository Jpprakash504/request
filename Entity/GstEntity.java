package com.example.Gst.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="gst")
public class GstEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	int pecentage;
	int hsncode;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPecentage() {
		return pecentage;
	}
	public void setPecentage(int pecentage) {
		this.pecentage = pecentage;
	}
	public int getHsncode() {
		return hsncode;
	}
	public void setHsncode(int hsncode) {
		this.hsncode = hsncode;
	}
	@Override
	public String toString() {
		return "GstEntity [id=" + id + ", pecentage=" + pecentage + ", hsncode=" + hsncode + "]";
	}

}
