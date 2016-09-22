package models;

import play.Mode;


public class Comapny extends Model{
	
	public String email;
	public String password;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	//Form<User> userform=FormFactory.form(User.class);
	public static Mode.Finder<Long,Comapny> find=new Mode.Finder<Long,Comapny>(Comapny.class); 


}
