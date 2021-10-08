package Java_Basic;

public class StaticNonstaticConcept {
	
	int a=12;             // non static global variable
	 static int b=55;  // static global variable

	public static void main(String[] args) {
		 // how to call static var and method
		
		// 1. direct 
		
		sum(2);
		
		// 2. by classname
            
		StaticNonstaticConcept.sum(8);
		
		// how to call non static method i.e by object creation
		
		StaticNonstaticConcept obj1= new StaticNonstaticConcept();
		obj1.sum();
		
		// how to call non static var?
		
		System.out.println(obj1.a); 
		
		
	}
  
	
	 public void sum() {  
		                      // non static method
		 System.out.println("this is non static method");
	 }
	 
   public static void sum(int d) {
	                                 // static method
			 System.out.println("this is static method");
		 }
		 
	 }

