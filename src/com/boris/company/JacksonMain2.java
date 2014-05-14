package com.boris.company;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;



public class JacksonMain2 {

	public static void main(String[] args) {
		
		
		ObjectMapper mapper = new ObjectMapper();
		 
		try {
	 
			// read from file, convert it to person class
			Person person = mapper.readValue(new File("C:\\Users\\Agape\\workspace18\\FromJavaToJSOn\\src\\user.json"), Person.class);
	 
			// display to console
			System.out.println(person);
	 
		} catch (JsonGenerationException e) {
	 
			e.printStackTrace();
	 
		} catch (JsonMappingException e) {
	 
			e.printStackTrace();
	 
		} catch (IOException e) {
	 
			e.printStackTrace();
	 
		}
	}
}
