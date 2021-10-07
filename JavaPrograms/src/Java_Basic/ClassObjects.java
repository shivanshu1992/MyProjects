package Java_Basic;

public class ClassObjects {
		
	int year;  // class or global variables
	int bike;
 
	
	public static void main(String[] args) {
		
		ClassObjects a1= new ClassObjects();  // new ClassObjects()- this is called object of class classobjects
		ClassObjects a2= new ClassObjects(); //a1,a2,a3- this is object reference variable
		
		ClassObjects a3= new ClassObjects();
		
		a2.year= 1995;
		a3.year= 2020;
		System.out.println(a3.year);
		
		// shifting of ref. variable
		a1=a2;
		a2=a3;
		a3=a1;
		a1.year=345;
		System.out.println("value of a1.year is after shifting "  + a1.year);
		a3.year=888;
		
		System.out.println("value of a1.year is after shifting "  + a1.year); // now value will be 888 
		
		
	}

}
