package StringManipulation;

public class reverseWordFromLast {

	public static void main(String[] args) {

		    // Reverse each word AND reverse word order


		        String str = "Life is beautiful";

		        // Split the sentence into words
		        String[] strArray = str.split(" ");

		        // Loop from last word to first
		        for (int j = strArray.length - 1; j >= 0; j--) {
		            String word = strArray[j];
		            String reverseString = "";

		            // Reverse the characters in the word
		            for (int i = word.length() - 1; i >= 0; i--) {
		                reverseString += word.charAt(i);
		            }

		            // Print the reversed word followed by a space
		            System.out.print(reverseString + " ");
		        }
		    }
		

	}


