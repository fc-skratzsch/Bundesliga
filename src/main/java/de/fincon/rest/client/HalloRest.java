package de.fincon.rest.client;

import org.springframework.web.client.RestTemplate;

public class HalloRest {

	final String uri = "http://localhost:8080/hello-world";

	public String getGreeting() {
		RestTemplate rest = new RestTemplate();
		String result = rest.getForObject(uri, String.class);
		return result;
	}

}