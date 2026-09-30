
public class ReverseNumber {

	public static void main(String[] args) {
		
		long n=123456;
		long rev=0;
		
		while(n!=0) {
			rev=rev*10 + n%10;
			n=n/10;				
		}
		System.out.println(rev);
		
		// second method using StringBuffer, convert integer into STring
//		int n1=654321;
//		System.out.println(new StringBuffer(String.valueOf(n1)).reverse());
	}
	


}
