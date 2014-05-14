package com.boris.company;

 
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.codehaus.jackson.map.ObjectMapper;
 
public class JsonMapFileExample {
    public static void main(String[] args) {
 
	ObjectMapper mapper = new ObjectMapper();
 
	Map<String, Object> map = new HashMap<String, Object>();
	map.put("name", "Boris");
	map.put("age", 29);
 
	List<Object> list = new ArrayList<Object>();
	list.add("customer 1");
	list.add("customer 2");
	
 
	map.put("messages", list);
 
	try {
 
		// write JSON to a file
		mapper.writeValue(new File("C:\\Users\\Agape\\workspace18\\JSONMapping\\src\\user.json"), map);
 
	} catch (Exception e) {
		e.printStackTrace();
	}
    }
}