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
public class Delegate2 extends Model{
	@Id
	@GeneratedValue
	public int did;
	public String delegateName;
	
	@ManyToMany(mappedBy="d1",cascade=CascadeType.ALL)
	public  List<Event2> e1=new ArrayList<Event2>();


}
