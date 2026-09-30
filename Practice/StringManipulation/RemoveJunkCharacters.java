package StringManipulation;

public class RemoveJunkCharacters {

	public static void main(String[] args) {
		//Remove junk characters or Special characters from String using regular expression
		//[a-zA-Z0-9] is a regular expression
		
		String s1="%$##$@@^ LatinCharacters *@$%$% SeleniumJava";
		String s2="";
		
		s2=s1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s2);
	}

}
