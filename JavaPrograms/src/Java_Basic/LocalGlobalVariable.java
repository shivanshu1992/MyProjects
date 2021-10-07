package Java_Basic;

public class LocalGlobalVariable {
	
	// these are global variable or class variable
	
	int key= 34;
	int number=90;

	public static void main(String[] args) {
		
		// these are local variables of main method
		
		int a=12;
		int b=360;
		System.out.println("value of a inside the main method  is " + a);
		LocalGlobalVariable  obj1= new LocalGlobalVariable ();
		obj1.newMethod(); // To access non static method make obj1 and call it with non static method
		System.out.println("value of key inside the main method is " + obj1.key);
		// To use global variable inside the main method create object first then use
		
		
	}

	
	 public void newMethod() {
		 int a=55;
		 int b=88;  // local variable of non static method
		 int key =34;
		 System.out.println("value of NUMBER inside the main method  is " + number);
		 
		 System.out.println("value of a inside the non static method  is " + a);
	 }
}
