package controllers;

import bean.PersonBean;
import models.Person;
import models.PersonDetail;
import play.Logger;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

public class RelationshipController extends Controller{
	//public static PersonDetail p;
	public static PersonBean bean = null;
	
	public Result addDetails(){
		bean =Form.form(PersonBean.class).bindFromRequest().get();
		Logger.info(bean.name +  " === " + bean.job);
		if (bean != null) {
			Person person = new Person();
			PersonDetail detail = new PersonDetail();
			
			detail.income = bean.income;
			detail.job = bean.job;
			detail.save();
			person.p_name = bean.name;
			person.pd = detail;
			person.save();
		}
		/*if(p!=null)
			p.save();*/
		return ok(views.html.OneToMany.render("poonam"));
		
	}

}
