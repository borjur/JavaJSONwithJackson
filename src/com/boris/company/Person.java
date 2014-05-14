package com.boris.company;

import java.util.ArrayList;
import java.util.List;

public class Person {
	
 private String name = " Boris";
 private int age= 25;
 
	private List<String> customer = new ArrayList<String>() {
		{
			add("customer 1");
			add("customer 2");
			
		}
	};

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<String> getCustomer() {
		return customer;
	}

	public void setCustomer(List<String> customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", customer="
				+ customer + "]";
	}
	
	
 

}
