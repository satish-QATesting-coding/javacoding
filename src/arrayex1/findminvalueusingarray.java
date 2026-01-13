package arrayex1;

public class findminvalueusingarray {

	
	  static int minimum(int[] array) {
	   int min= array[0]; // assume first element as min
	   
	  
		  for(int i=1;i<array.length;i++) {
			  
			  if(array[i]< min) {
				  min=array[i];
			  }
			  
			  
			  
		  }
  
		  return min;
		  
		  
	  }
	
	
	public static void main(String[] args) {

		int[] a = {5, 2, 8, 3, 1, 9, 4};
		 
		int result=minimum(a);
		System.out.println("min value" +result);
		
		

	}

}
