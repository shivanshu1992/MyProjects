package Java_Basic;

public class TwoDimensionArray {

	public static void main(String[] args) {
		
		String s1 [][]= new String[2][3];
		System.out.println("length of row is " + s1.length);
		System.out.println("length of column is " + s1[0].length);
		
		// 1st row
		
		s1[0][0]="usha";
		s1[0][1]= "shivanshu";
		s1[0][2]="tinu";
		
		//2nd row
		
		s1[1][0]="usha1";
		s1[1][1]= "shivanshu1";
		s1[1][2]="tinu1";
		
		// print all values of 2d array
		int row;
		int col;
		// if 2 loop are there then inner loop will run 1st with respect to 1st loop
		// here col=0 loop will run 1st till row=0 is completed
		
		
		for (row=0; row<s1.length; row++) { 		
			for(col=0;col<s1[0].length;col++) {
				System.out.println("values of 2d array is  " + s1[row][col]);
				
			}
			
		}
			
		

	}

}
