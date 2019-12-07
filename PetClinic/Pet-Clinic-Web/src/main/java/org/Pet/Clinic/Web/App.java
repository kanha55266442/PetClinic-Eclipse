package org.Pet.Clinic.Web;

import org.Pet.Clinic.Web.controller.IndexController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



/**
 * Hello world!
 *
 */
@SpringBootApplication
@ComponentScan(basePackageClasses = IndexController.class)
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("App.main()");
    	SpringApplication.run(App.class, args);
    }
}
