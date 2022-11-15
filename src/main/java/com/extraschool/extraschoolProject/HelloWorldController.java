package com.extraschool.extraschoolProject;


import entity.Informacion;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloWorldController {
	private String response = "extraschool";

	@RequestMapping(value = "/AboutUs", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String aboutus() {
		response = "cambio";
		return response;
	}

	@RequestMapping(value = "/Contact", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String contact() {

		return response;
	}

	@GetMapping(value = "/contactoinfo", produces = MediaType.APPLICATION_JSON_VALUE)
	public String contactinfo() {
		String contactstring = "s";

		Informacion informacion = new Informacion();
		informacion.setTexto("Informacion de contacto");
		contactstring = informacion.getTexto();

		return contactstring;
	}

	@GetMapping(value = "/sobreNosotros", produces = MediaType.APPLICATION_JSON_VALUE)
	public Map<String, String> aboutUs() {
		HashMap<String, String> map = new HashMap<>();
		map.put("Informacion", "sobre nosotros");
		return map;
	}

	@GetMapping(value = "/contacto", produces = MediaType.APPLICATION_JSON_VALUE)
	public Map<String, String> contacto() {
		HashMap<String, String> map = new HashMap<>();
		map.put("Informacion", "de contacto");
		return map;
	}

	/**
	 * get field
	 *
	 * @return response
	 */
	public String getResponse() {
		return this.response;
	}
}