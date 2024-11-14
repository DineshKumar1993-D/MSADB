package com.pojorunner;

import com.pojo.Pojo_Class;

public class Pojo_Runner extends Pojo_Class {
	
	public static void main(String[] args) {
		
		Pojo_Runner pojo = new Pojo_Runner();
		pojo.setName("Java");
		pojo.setAge(20);
		pojo.setGen('A');
		System.out.println(pojo.getName()+"="+pojo.getAge()+"="+pojo.getGen());
	}

}
