package org.Pet.Clinic.Web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping({ "", "/", "/index", "/index.html" })
	public String homepage() {
	System.out.println("IndexController.homepage()");
		return "index";
	}
}
