package StringManipulation;

public class RemoveDuplicateCharacterFromString {

	public static String removeDuplicateChar(String str) {
		
		String s1="";	
		for(int i=0; i<str.length(); i++) {
			
			if(s1.indexOf(str.charAt(i))==-1) {
				s1+=str.charAt(i);
			}
		}return s1;
	}
	
	public static void main(String[] args) {
		// Remove duplicate character from aaasbbbccdddeeggss
		
		System.out.println("String without duplicate= "+removeDuplicateChar("aaasbbbccdddeeggss"));
		System.out.println("String without duplicate= "+removeDuplicateChar("My name is Virendra"));

	}
	
/*
 * Another way using String builder
package StringManuplation;

public class RemoveDuplicateCharacterFromString {

    public static String removeDuplicateChar(String str) {
        StringBuilder result = new StringBuilder();
        
        // Iterate over the string
        for (int i = 0; i < str.length(); i++) {
            // Check if the character is already in the result string
            if (result.indexOf(String.valueOf(str.charAt(i))) == -1) {
                result.append(str.charAt(i));
            }
        }
        return result.toString();  // Return the string without duplicates
    }
    
    public static void main(String[] args) {
        // Remove duplicate characters from "aaasbbbccdddeeggss"
        System.out.println("String without duplicate= " + removeDuplicateChar("aaasbbbccdddeeggss"));
    }
}

*/

}
