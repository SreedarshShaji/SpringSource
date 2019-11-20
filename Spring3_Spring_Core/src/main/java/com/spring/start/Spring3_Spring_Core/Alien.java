package com.spring.start.Spring3_Spring_Core;

public class Alien {
	
	int age;
	 	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("This is a setter!!!");
		this.age = age;
	}

		public Alien() {
		System.out.println("This is a constructor");
	}

		public void code()
	 	{
	 		System.out.println("Hey there, I am coding");
	 	}
}
