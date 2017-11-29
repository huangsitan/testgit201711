package com;

public class Person {

	private String name;
	private int age;
	
	public Person(){
		 System.out.print("构造方法");
		 age=18;
	}
	
	static{
	   System.out.print("代码块");
	}
	
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
