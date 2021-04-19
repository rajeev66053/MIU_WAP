package fetchEagerLazy;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
public class Alien //POJO
{ 
	@Id
	private int aid;
	private String aname;
	@OneToMany(mappedBy="alien",fetch=FetchType.EAGER) //By default lazy loading(execute one query for alien and seperate query for laptop collection).Using this will make eager loading of laptops.
	private Collection<Laptop> laptops=new ArrayList<Laptop>();
	
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
	public Collection<Laptop> getLaptops() {
		return laptops;
	}
	public void setLaptops(Collection<Laptop> laptops) {
		this.laptops = laptops;
	}

}
