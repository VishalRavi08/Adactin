package com.pojorunner.com;

import com.Pojo.com.PojoTopic;

public class PojoRunner {
	
	public static void main(String[] args) {
		
		//calling properties without extends
		
		PojoTopic pojo = new PojoTopic();
		pojo.setAge(19);
		pojo.setName("Laptop");
	
		int age = pojo.getAge();
		System.out.println(age);
		
		System.out.println(pojo.getName());
	
	
	}

}
