package com.javatech.spring.swagger.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SweggerController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/api/javatech")
	public String sayHelloSwegger() {
		return "Welcome To Spring Swegger  World";
	}
	@RequestMapping(method = RequestMethod.GET, value = "/api/javatech/getIndianMetroCities")
	public String getIndianMetrocities() {
		StringBuffer sbMetroCities = new StringBuffer();
		sbMetroCities.append("Delhi,");
		sbMetroCities.append("Mumbai,");
		sbMetroCities.append("Kolkata,");
		sbMetroCities.append("Bengaluru,");
		sbMetroCities.append("Chennai,");
		sbMetroCities.append("Hyderabad,");
		sbMetroCities.append("Ahemdabad,");
		sbMetroCities.append("Pune");
		
		return sbMetroCities.toString();
	}
}
