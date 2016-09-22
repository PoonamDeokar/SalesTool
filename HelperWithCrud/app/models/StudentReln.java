package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.avaje.ebean.Model;
import com.avaje.ebean.Model.Finder;

@Entity
public class StudentReln extends Model{
	@Id
	@GeneratedValue
	public long sid;
	public String sname;
	
	@ManyToOne
	@JoinColumn(name="college_cid")
	public College college;
	
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	
	public static Finder<Long,StudentReln> find = new Finder(Long.class, StudentReln.class);

}
