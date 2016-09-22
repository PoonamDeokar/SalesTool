package controllers;

import models.Student;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

public class StudentAdd extends Controller{
	
	public static Student stud;
	
	public Result studAdd(){
		Form<Student> s=Form.form(Student.class).bindFromRequest();
		stud=s.get();
		if(stud.studentName!=null&&stud!=null ){
			stud.save();
		}
		return ok(views.html.studAdd.render(s));
		
		
	}

}
