package com.sbic;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Value("${username}")
	private String username;
	
	@Value("${url}")
	private String url;

	@Value("${pwd}")
	private String pwd;

	@Value("${driver.name}")
	private String driverName;

	

	@GetMapping("/message")
	Map<String,String> message() {
	Map<String ,String> map = new HashMap<String,String>();
	map.put("Driver Name", driverName);
	map.put("User Name ", username);
	map.put("URL", url);
	map.put("Password ", pwd);
	return map;
	
	}

}
