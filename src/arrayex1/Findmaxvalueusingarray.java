package arrayex1;

   
public class Findmaxvalueusingarray {
	
	
	static int maximum(int[]  array) {
		int max= array[0];
		
		
		
		for(int i=0;i<array.length;i++) {
			
			if(array[i]>max) {
				
				max=array[i];
			}
			
		}
		
		return max;
	}
	
	

	public static void main(String[] args) {
		
		int[] a = {5, 2, 8, 3, 1, 9, 4};
		
		int result=maximum(a);
		System.out.println("max value :" +result);
		
		
	}

}
