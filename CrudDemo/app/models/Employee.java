package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.avaje.ebean.Model;

@Entity
public class Employee extends Model {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long eid;
	public String fname;
	public String lname;
	public String pass;
	public String gen;
	public String sal;
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getGen() {
		return gen;
	}
	public void setGen(String gen) {
		this.gen = gen;
	}
	public String getSal() {
		return sal;
	}
	public void setSal(String sal) {
		this.sal = sal;
	}
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", fname=" + fname + ", lname=" + lname
				+ ", pass=" + pass + ", gen=" + gen + ", sal=" + sal + "]";
	}
	
	
	
	public static Model.Finder<Long,Employee> find=new Model.Finder<Long,Employee>(Employee.class); 
	

}
