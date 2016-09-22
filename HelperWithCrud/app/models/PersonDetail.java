package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.avaje.ebean.Model;
import com.avaje.ebean.Model.Finder;

@Entity
public class PersonDetail extends Model {
	@Id
	@GeneratedValue
	@Column(name="detail_pk")
	public long pdId;
	public String job;
	public double income;
	
	
	public long getPd_id() {
		return pdId;
	}
	public void setPd_id(long pdId) {
		this.pdId = pdId;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	
	public static Finder<Long,PersonDetail> find = new Finder(Long.class, PersonDetail.class);
	

}
