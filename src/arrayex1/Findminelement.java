package arrayex1;


class C1{
	
	static public int  minmaxvalue(int[]a,int total) 
	{
		  for(int i=0;i<a.length;i++)
		  {
			  for(int j=i+1;j<a.length;j++) 
			  {
				  if(a[i]>a[j]) 
				  {
					  int temp=a[i];
					  a[i]=a[j];
					  a[j]=temp;
					  
				  }
				  
			  }
			  
		  }
		
		  return a[total-4];
	}
	
	
}

public class Findminelement {

	public static void main(String[] args) {
		
		int[]a = {6,8,5,4,3,9,2};
        
		int x=a.length;
		System.out.println();
		 
		System.out.println("Smallest elemet is "+ C1.minmaxvalue(a, x));
		 

	}

}
