package models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.avaje.ebean.Model;
@Entity
public class Person extends Model{
	
	@Id
	@GeneratedValue
	public long p_id;
	public String p_name;
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="pdeatil_fk")
	public PersonDetail pd;
	

	public long getP_id() {
		return p_id;
	}

	public void setP_id(long p_id) {
		this.p_id = p_id;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public PersonDetail getPd() {
		return pd;
	}

	public void setPd(PersonDetail pd) {
		this.pd = pd;
	}
	
	public static Finder<Long,Person> find = new Finder(Long.class, Person.class);
	
	
	
	

}
