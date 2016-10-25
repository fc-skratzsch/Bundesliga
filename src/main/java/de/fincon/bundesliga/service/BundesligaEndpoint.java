package de.fincon.bundesliga.service;


import java.io.IOException;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import de.bundesliga.GetSpielRequest;
import de.bundesliga.GetSpielResponse;
import de.bundesliga.Spiel;
import de.fincon.dom.Message;
import de.fincon.rest.client.HalloRest;

@Endpoint
public class BundesligaEndpoint {
	
	private static final String NAMESPACE_URI = "http://bundesliga.de";
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getSpielRequest")
	@ResponsePayload
	public GetSpielResponse getSpiel(@RequestPayload GetSpielRequest request) {

		Spiel spiel = new Spiel();
		spiel.setMannschaft("Pauli");
		
		Spiel error = new Spiel();
		error.setMannschaft("Error");
		
		
		String restresponse = "";
		HalloRest rest = new HalloRest();
		restresponse = rest.getGreeting();
		
		ObjectMapper mapper = new ObjectMapper();
		Message msg = new Message();
		
		try {
			msg = mapper.readValue(restresponse, Message.class);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		GetSpielResponse response = new GetSpielResponse();
		
		if (msg.getContent().equals("Hello, World!")){
			
			response.setSpiel(spiel);
		} else {
			response.setSpiel(error);
		}
	
		return response;
	}
}
