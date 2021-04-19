package secondLevelCacheDemo;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity //this annotation name will be used to name the Entity @Entity(name="alien_table")
@Table(name="alien_table") //this name will be used to name a table in DB @Table(name="alien_table")
@Cacheable //To specify we are using cache for this class use this annotation otherwise the second level cache doesnot work.
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class Alien //POJO
{ 
	@Id
	private int aid;
	private String aname;
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
