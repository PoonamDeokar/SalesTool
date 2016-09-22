package controllers;

import java.util.ArrayList;
import java.util.List;

import models.Delegate2;
import models.Event2;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import bean.EventBean;
import bean.StudentBean;

public class ManyToMany extends Controller{
	
	public static EventBean bean=null;
	
	public Result call(){
		return ok(views.html.manytomany.render("k"));
	}
	
	public Result addManyToMany(){
		bean=Form.form(EventBean.class).bindFromRequest().get();
		
		if(bean!=null){
			Event2 event=new Event2();
			Delegate2 delegate=new Delegate2();
			
			event.eventName=bean.eventName;
			delegate.delegateName=bean.delegateName;
			
			List<Delegate2> ld1=new ArrayList<Delegate2>();
			ld1.add(delegate);
		   event.d1=ld1;
			
		
			List<Event2> le1=new ArrayList<Event2>();
			le1.add(event);
			delegate.e1=le1;
			
	
		
			event.save();
			delegate.save();
			
		
				
		}
		return ok("Saved Successfully");
		
	}

}
