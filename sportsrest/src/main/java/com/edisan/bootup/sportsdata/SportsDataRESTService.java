package com.edisan.bootup.sportsdata;

import com.edisan.bootup.sportsdata.model.SDPlayer;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Properties;

public class SportsDataRESTService {
	
	private static final String SVC_KEY_NAME = "Ocp-Apim-Subscription-Key";
	private final String svcKey;
	private final String svcUrl;
	
	public SportsDataRESTService() {
		Properties props = new Properties();
		try {
			props.load(getClass().getResourceAsStream("/application.properties"));
			
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		
		svcUrl = props.getProperty("PlayerDetailsURL");
		svcKey = props.getProperty("SvcKey");
	}
	
	public SDPlayer getPlayer(long playerID) {
		RestTemplate template = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.set(SVC_KEY_NAME, svcKey);
		
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		
		String url = svcUrl + playerID;
		ResponseEntity<SDPlayer> result = template.exchange(url, HttpMethod.GET, entity, SDPlayer.class);
		
		return result.getBody();
	}

}
