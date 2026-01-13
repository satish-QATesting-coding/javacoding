package arrayex1;

import java.util.Arrays;

public class Arraysmethodex1 {

	public static void main(String[] args) {
		
		int[] a= {5,35,25,30,35,40};
		int[] b = {15,20,25,30,35,40};
		
		boolean flag=Arrays.equals(a,b);
		System.out.println(flag);
		int x=Arrays.compare(a, b);
		System.out.println("Comapre two arrays"+ x);
       
	Arrays.sort(a);
	
	for(int z:a)
	{
		System.out.println(z);
	
	}
		
		
		int y=Arrays.binarySearch(a, 40);
		System.out.println(y);
		
		

	}

}
