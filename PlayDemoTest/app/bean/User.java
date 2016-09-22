package bean;

import play.api.data.Form;
import play.data.FormFactory;



public class User {
	
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

}
