package controllers;

import java.util.List;

import com.avaje.ebean.Ebean;
import com.avaje.ebeaninternal.api.BindParams.Param;

import models.Employee;
import play.Logger;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.*;
import views.html.*;


public class HomeController extends Controller {

	  public static Employee emp;
	
	    
  
    public Result index() {
        return ok(index.render("Your new application is ready."));
    }

  //inserting value to database
  
    public Result addEmp(){
    	emp=Form.form(Employee.class).bindFromRequest().get();
    	/*String fname=emp.getFname();
    	String lname=emp.getLname();
    	String pass=emp.getPass();
    	String sal=emp.getSal();
    	if(fname!=null && lname!=null && pass!=null && sal!=null)*/
    	
    	if(emp!=null)
    	{
    	emp.save();
    	
    	return ok("Data Added Successfully");
    	}
    	return ok("Please Enter value");
    	//return redirect(routes.HomeController.index());	
    }
    
    
   //Retrieving values from database
    
 public Result getEmp(){
	  
   		
    	DynamicForm form=DynamicForm.form().bindFromRequest();
    	String name=form.get("eid");
    	Long id=Long.parseLong(name);
    	
    	return ok(views.html.allEmployess.render(Employee.find.byId(id)));
   }
    
    
    //deleting employee deatils
    
    public Result deleteEmp(){
    	emp=Form.form(Employee.class).bindFromRequest().get();
    	Logger.info("--Delete"+"  " +emp.eid);
    		emp.delete();
    		return ok("Data Deleted Successfully");    	
       }
    
    //updating Employee Details
    public Result updateEmp(){
    	emp=Form.form(Employee.class).bindFromRequest().get();
    	//if(emp!=null)
    	Logger.info("--Updated" +" "+emp.fname);
    		emp.update();
    	return ok("Data Updated Sucessfully");
    	//return redirect(routes.HomeController.index());
    }
    
    //displaying all employee data
    public Result displayAllData(){
    	
    	return ok(views.html.displayAllEmp.render());
    }
    
}
