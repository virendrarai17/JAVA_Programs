package StringManipulation;

public class ReverseString {

	public static void main(String[] args) {
		
		String s1="Developer";
		String s2="";
		
		for(int i=s1.length()-1; i>=0; i--) {
			s2+=s1.charAt(i);
		}
		System.out.println("Reverse String of String: "+ s2);
		
		
		//Reverse a String using StringBuffer
		
		StringBuffer sb=new StringBuffer(s1);
		System.out.println("Reverse String using Reverse function"+sb.reverse());

	}
	
		

}
