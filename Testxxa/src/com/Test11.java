package com;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //Person p = new Person();
		try {
			Class.forName("com.Person");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
