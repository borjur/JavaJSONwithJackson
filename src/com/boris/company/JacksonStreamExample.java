package com.boris.company;
import java.io.File;
import java.io.IOException;
import org.codehaus.jackson.JsonEncoding;
import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.JsonMappingException;
 
public class JacksonStreamExample {
   public static void main(String[] args) {
 
     try {
 
	JsonFactory jfactory = new JsonFactory();
 
	/*** write to file ***/
	JsonGenerator jGenerator = jfactory.createJsonGenerator(new File(
			"C:\\Users\\Agape\\workspace18\\FromJavaToJSOn\\src\\user.json"), JsonEncoding.UTF8);
	jGenerator.writeStartObject(); // {
 
	jGenerator.writeStringField("name", "Boris"); // "name" : "Boris"
	jGenerator.writeNumberField("age", 29); // "age" : 29
 
	jGenerator.writeFieldName("messages"); // "messages" :
	jGenerator.writeStartArray(); // [
 
	jGenerator.writeString("customer 1"); // "msg 1"
	jGenerator.writeString("customer 2"); // "msg 2"

 
	jGenerator.writeEndArray(); // ]
 
	jGenerator.writeEndObject(); // }
 
	jGenerator.close();
 
     } catch (JsonGenerationException e) {
 
	e.printStackTrace();
 
     } catch (JsonMappingException e) {
 
	e.printStackTrace();
 
     } catch (IOException e) {
 
	e.printStackTrace();
 
     }
 
   }
 
}