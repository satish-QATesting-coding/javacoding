package pkg2;


class sqe{
	
	int square(int n){
		
	 return n*n;
		//int T=n*n;
		//System.out.println("square of a number:" + T);
	}
}

public class Methodsquare {

	public static void main(String[] args) {
		sqe obj=new sqe();
		int result=obj.square(5);
		System.out.println("square of a number:" + result);
	}

}
