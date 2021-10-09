package Overriding_Polymorphism_Inheritance;

public class ChildClass extends ParentClass {

	public void add() { 
		
//method override- when same method is present in parent class with same name and same argument
		
		System.out.println("This is add method in child class");
	}
	
	public void subtract() {
		System.out.println("This is subtract method in child class");
	}
	
	public void multiple() {
		System.out.println("This is multiple  method in child class");
	}
	
}
