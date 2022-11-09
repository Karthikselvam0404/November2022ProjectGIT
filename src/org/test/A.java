package org.test;

public class A {
	
	   public A(String name) {
		   this(234);
		   
		   System.out.println("Employee name:"+ name );
		
	}
	   
	   public A(int id) {
		   this(23455.789f);
		   System.out.println("Employee id:"+ id);
		   
		   
		}
	   
	   public A(float salary) {
		   
		   
		   System.out.println("Employee salary:"+ salary);
		
	}
	   
		   
	
	   
	   
	   public static void main(String[] args) {
		   
		   A a = new A("Dylan");
		   B b = new B(894729866l);
		
	}

}
