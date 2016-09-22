package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.avaje.ebean.Model;
import com.avaje.ebean.Model.Finder;

@Entity
public class Student extends Model{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long id;
	public String studentName;
	public String lName;
	public long phone_no;
	
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public long getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(long phone_no) {
		this.phone_no = phone_no;
	}
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", studentName=" + studentName
				+ ", lName=" + lName + ", phone_no=" + phone_no + "]";
	}
	
	public static Finder<Long,Student> find=new Model.Finder<Long,Student>(Student.class);

}
