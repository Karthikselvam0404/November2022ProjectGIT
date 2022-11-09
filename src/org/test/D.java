package org.test;

public class D extends C {
	
	@Override
	public void tc01(int id) {
		
		System.out.println("Employee id:"+ id);
		super.tc01(456);
	}
	
	@Override
	public void tc01(String name) {
		
		System.out.println("Employee name:"+ name);
		super.tc01("Scott");
		
	}
	
	public void tc03() {
		
		System.out.println("Method 3");

	}
	
	public void tc04() {
		System.out.println("Method 4");

	}
	
	public static void main(String[] args) {
		
		D d = new D();
		d.tc01(123);
		d.tc01("Dylan");
		d.tc03();
		d.tc04();
		
		
	}
	
	

}
