package Java_Basic;

public class ArrayConcept {

	public static void main(String[] args) {
		
		int i[]= new int[6];
		char c[]= new char[5];
		double d[]= new double[4];
		String s[]= new String[3];// to find length of String use s.length
		boolean b []= new boolean[2];
		Object ob1[]= new Object[4];
		ob1[0]=34;
		ob1[1]="SHIVANSHU SHARMA";
		ob1[2]=true;
		ob1[3]='t';
		i[0]=122;
		i [1]=1242;
		i [2]=13422;
		i [3]=13422;
		i [4]=12422;
		i [5]=12242;
		int k;
		
		// 1. array is use to same data type  and to overcome this use Object array
		
		System.out.println("value of array at index 5 is  " +  i[5]);
		
		//System.out.println("value of array at index 6 is  " +  i[6]);// this will give indexoutofbound error
		
		// To find length of array use :
		
		System.out.println("Length of array  is  " +  i.length);
		
		// print values of array
		
		for(k=0; k<i.length; k++)
		{
			System.out.println("Values of array at index " + k + " is  "  + i[k]);
			
		}
		
		System.out.println("value of array at index 1 is  " +  ob1[3]);
		
	}

}
