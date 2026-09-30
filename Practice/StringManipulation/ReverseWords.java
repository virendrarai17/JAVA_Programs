package StringManipulation;

public class ReverseWords {
    // Reverse each word without changing the order of words

    public static void main(String[] args) {
        
        String str = "Life is beautiful";

        // Split the sentence into words
        String[] strArray = str.split(" ");

        // Loop through each word
        for (String word : strArray) {
            String reverseString = "";

            // Reverse the current word
            for (int i = word.length() - 1; i >= 0; i--) {
                reverseString += word.charAt(i);
            }

            // Print the reversed word followed by a space
            System.out.print(reverseString + " ");
        }
    }
}


