package StringManipulation;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {

		String s1 = "     Naveen 625324354=&*$Automation labs     " + "\n" + "    Java courses   " + "\t and Springboot  \t";

		String s2 = "";
		System.out.println(s1); //String before trim
		// 1st approach using trim
		System.out.println(s1.trim()); // remove the spaces from initial and last
		// 2nd using replaceALl
		System.out.println(s1.replaceAll("\\s+", "")); // replace the spaces with no space
		// 3rd without using any inbuilt method
		for(int i=0; i<s1.length(); i++) {

			if(s1.charAt(i)!=' ' && s1.charAt(i)!='\t') {

				s2=s2+s1.charAt(i);
			}

		}
		System.out.println(s2);
		// 4th remove nonwords character also means speacial character	
		System.out.println(s1.replaceAll("\\W", ""));// \W means remove all NON WORDS character
	}

}
