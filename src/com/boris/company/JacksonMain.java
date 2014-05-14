package com.boris.company;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JacksonMain {

	public static void main(String[] args) {

		Person person = new Person();

		ObjectMapper mapper = new ObjectMapper();
		
		try {
			 
			// convert user object to json string, and save to a file
			mapper.writeValue(new File("C:\\Users\\Agape\\workspace18\\FromJavaToJSOn\\src\\user.json"), person);
	 
			// display to console
			System.out.println(mapper.writeValueAsString(person));
	 
		} catch (JsonGenerationException e) {
	 
			e.printStackTrace();
	 
		} catch (JsonMappingException e) {
	 
			e.printStackTrace();
	 
		} catch (IOException e) {
	 
			e.printStackTrace();
	 
		}
	}

}
