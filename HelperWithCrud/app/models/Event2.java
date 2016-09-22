package models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.avaje.ebean.Model;

@Entity
public class Event2 extends Model {
	@Id
	@GeneratedValue
	public int eid;
	public String eventName;
	
	
	
	@ManyToMany(cascade=CascadeType.ALL)
	public  List<Delegate2> d1=new ArrayList<Delegate2>();

	
	
	

}
