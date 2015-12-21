package controllers;

import play.*;
import play.data.validation.Email;
import play.data.validation.Required;
import play.mvc.*;

import java.util.*;

import models.*;
//Hello world 
public class Application extends Controller {

    public static void index() {
        render();
    }

    public static void sayHello(@Required String fName,@Required String lName,@Email String email,@Required String pswd){
    		render(fName,lName,email,pswd);
    }
    
    public static void ticket() {
        render();
    } 
    
    public static void Detail() {
        render();
    } 
}