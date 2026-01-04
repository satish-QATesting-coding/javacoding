package loopingstatements;

public class Revnumusingstring {

	public static void main(String[] args) {

		int num=123;
		
		String str= String.valueOf(num);
		String rev="";		
		
		
		for (int i = str.length() -1;i>=0;i--) {
		
		   rev= rev + str.charAt(i);
		}
				System.out.println(rev);
	}
	

}
