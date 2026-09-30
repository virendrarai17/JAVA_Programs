package StringManipulation;

public class reverseStringfromLastindex {

	public static String reverseStringFromLastIndex(String words) {
		
		StringBuilder builder=new StringBuilder(words);
		return builder.reverse().toString();
	}
	
	public static void main(String[] args) {
		
		String reverseString=reverseStringFromLastIndex("Hello WOrld");
		System.out.println(reverseString);
		
	}

}
