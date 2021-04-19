package com.telusko.DemoHib;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity //this annotation name will be used to name the Entity @Entity(name="alien_table")
@Table(name="aliens") //this name will be used to name a table in DB @Table(name="aliens")
public class Alien //POJO
{ 
	@Id
	private int aid;
//	@Transient // This will prevent from store name field
	private String aname;
	@Column(name="alien_color") //change column name to alien_color
	private String color;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", color=" + color + "]";
	}

}
