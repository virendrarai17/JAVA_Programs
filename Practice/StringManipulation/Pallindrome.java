package StringManipulation;
import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		// String which is equal after reverse "Kanak"
		int x = 1;
		do {

			Scanner scn = new Scanner(System.in);
			System.out.println("Enter any String");
			String s1 = scn.next();

			String s2 = "";

			for (int i = s1.length() - 1; i >= 0; i--) {
				s2 += s1.charAt(i);
			}
			if (s2.equalsIgnoreCase(s1)) {
				System.out.println("String is Pallindrome");
			} else {
				System.out.println("String not Pallindrome");
			}
			System.out.println("Press 1 to continue");
			x = scn.nextInt();
		} while (x == 1);

	}
}
