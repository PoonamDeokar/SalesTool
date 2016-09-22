package controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import models.College;
import models.StudentReln;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import bean.StudentBean;

public class OneToManyAndM1 extends Controller{
	
	public static StudentBean bean=null;
	
	public Result addOneToM(){
		bean=Form.form(StudentBean.class).bindFromRequest().get();
		if(bean!=null){
			StudentReln srel=new StudentReln();
			College crel=null;
			
			College existCrel=(College) College.find.where().eq("cname", bean.cname).findUnique();
			if (existCrel!=null) {
				crel=existCrel;
			}
			else
			{
				crel=new College();
			}

			srel.sname=bean.sname;
			crel.cname=bean.cname;
			srel.college=crel;

			List<StudentReln> list=new ArrayList<StudentReln>();
		
			list.add(srel);
			crel.student=list;
			crel.save();
			
		}
		return ok(views.html.manytomany.render("poonam"));
	}
	
	
	

}
