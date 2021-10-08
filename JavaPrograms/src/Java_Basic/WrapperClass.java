package Java_Basic;

public class WrapperClass {

	public static void main(String[] args) {
			
		String s1= "100";
		System.out.println(s1+20);
		
		// Conversion from string to integer
		
		int i= Integer.parseInt(s1);
		System.out.println(i+ 20);
		
		// string to boolean
		
		String k= "true";
		boolean b = Boolean.parseBoolean(k);
		System.out.println(b);
		
		
	}

}
