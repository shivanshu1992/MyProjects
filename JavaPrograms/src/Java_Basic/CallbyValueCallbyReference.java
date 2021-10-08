package Java_Basic;

public class CallbyValueCallbyReference {

	public static void main(String[] args) {
		int x=30;
		int y=90;
		CallbyValueCallbyReference obj1 =new CallbyValueCallbyReference();
		obj1.sum(x, y); // call by value or pass by value
		
	}
          public int sum(int a, int b) { // here x, y will be copy of a,b
        	  a=98;
        	  b=76;
        	  int c=a+b;
        	  return c;
        	  
          }
}
