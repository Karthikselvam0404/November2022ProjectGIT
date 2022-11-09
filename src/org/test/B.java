package org.test;

public class B  {
	
	public B(long number) {
		this(345,7896.98f);
		
		System.out.println("Emplyoee phno:"+ number);
		
	}
	
	public B(int id,float salary) {
		this("Scott");
		
		System.out.println("Employee:"+ id +"/t" + salary);
	}
	
	public B(String name) {
		
		System.out.println("Employee:"+ name);
		
	}
	
	
	


}
