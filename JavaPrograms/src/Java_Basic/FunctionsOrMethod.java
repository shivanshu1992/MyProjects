package Java_Basic;

public class FunctionsOrMethod {

	public static void main(String[] args) {
		// now create object to print something and all non static method will be given to object
		
		FunctionsOrMethod obj1= new FunctionsOrMethod();
		// this is object, if you want to call non static method create object then
		
		obj1.test();
		int l=obj1.add();
		System.out.println("value of add method is  "   +l);
		String p =obj1.name();
		System.out.println("value of string method is  "   +p);
		int a=obj1.division(20, 10);
		System.out.println("value of division method is  "   +a);
		

	}

	 // Non static methods
	// void doesnot return any value
	
	public void test() {    // here use void bcz it will not return anything
		System.out.println("this is testMethod");
		// no input no output
	}
	
	public int add() {   // here we cannot use void bcz it will return value so use int
		System.out.println("this is add method")
;
		int a=1;
		int b=40;
		int c=a+b;
		 
		return c; // no input only output
	}
	
	public String name() { // no input only output
		System.out.println("this is string method");
		String s1="selenium";
		
		return s1;
		
	}
	
	public int division(int x, int y) { // input arguments or parameters
		System.out.println("this is divison method");
		
		
		int m= x/y;
		
		return m;
		
	}
	
}
