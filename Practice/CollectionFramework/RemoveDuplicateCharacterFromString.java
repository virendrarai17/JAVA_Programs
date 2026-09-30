package CollectionFramework;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacterFromString {

	public static String removeDuplicate(String str) {
		
		Set<Character> set=new LinkedHashSet<>();
		
		for(int i=0; i<str.length(); i++) {
			set.add(str.charAt(i));
		}
		
		StringBuilder result=new StringBuilder();
		for(char c:set) {
			result.append(c);
		}
		
		return result.toString();
	}
	
	
	
	public static void main(String[] args) {
		// Remove duplicate character from String using set
		
		System.out.println(removeDuplicate("aaadsdsdhfsgfgasfgafsfadsfdafwqwq"));

	}

}
