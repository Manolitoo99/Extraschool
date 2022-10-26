package com.springdemo.helloworld;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	private final String response = "extraschool";

	@RequestMapping(value = "/AboutUs", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String aboutus() {
		return response;
	}

	@RequestMapping(value = "/Contacto", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String contacto() {

		return response;
	}

}