package controllers;

import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

public class StudentRetrive extends Controller{
	
	public Result studRetrive(){
	
		DynamicForm form=DynamicForm.form().bindFromRequest();
		String name=form.get("id");
		Long id=Long.parseLong(name);
		return ok();
		
	}

}
