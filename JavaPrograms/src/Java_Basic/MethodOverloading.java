package Java_Basic;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading obj1= new MethodOverloading();
		obj1.sum();
		obj1.sum(5);
		obj1.sum("SHIVANSHU");
	}

	public void sum() {  // method overloading- with same name but diff. arguments
		System.out.println("This 1st method");
		
	}
public void sum(int a) {
	
	System.out.println("This 2nd method");
	}
public void sum(String a) {
	
	System.out.println("This 3rd method");
}
}


