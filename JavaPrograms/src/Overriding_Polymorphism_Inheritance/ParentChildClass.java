package Overriding_Polymorphism_Inheritance;

public class ParentChildClass {

	public static void main(String[] args) {
		
		ChildClass obj1= new ChildClass(); // static polymorphism
// Polymorphism- one to many or many methods
		obj1.add();
		obj1.subtract();
		obj1.books();
		obj1.pens();
		obj1.grandParent();
		
		ParentClass obj2= new ParentClass();
		obj2.books();
		obj2.pens();
		// obj2.subtract  // not allowed bcz parent cannot inherit child  method proprties
		
		ParentClass obj3= new ChildClass(); 
// child class object can be referred by parent class variable- dynamic polymorphism
		obj3.add();
		obj3.pens();
		obj3.books();
		//obj3.subtract  // parent  cannot inherit child class method
		
		//ChildClass obj4= new ParentClass();// This cannot be done as parent cannot fit into child method
		
		//ChildClass obj4= (ChildClass) new ParentClass(); //classcastexception

	}

}
