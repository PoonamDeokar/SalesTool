package models;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.avaje.ebean.Model;
import com.avaje.ebean.Model.Finder;

@Entity
public class College extends Model {
	
	@Id
	@GeneratedValue
	public long cid;
	public String cname;
	
	@OneToMany(cascade=CascadeType.ALL)
	public List<StudentReln> student;

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	
	public List<StudentReln> getStudent() {
		return student;
	}

	public void setStudent(List<StudentReln> student) {
		this.student = student;
	}
	
	
	public static Finder<Long,College> find = new Finder<Long,College>(Long.class, College.class);
	
	

}
