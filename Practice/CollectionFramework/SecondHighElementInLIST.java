package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondHighElementInLIST {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, -20, 30, 40, 50, 50, 40, -10, 60, 70));

		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;

		for (int num : list) {
			// Check for the highest
			if (num > first) {
				third = second;
				second = first;
				first = num;
			}
			// Check for the 2nd highest, but avoid duplicate of highest
			else if (num > second && num < first) {
				third = second;
				second = num;
			}
			// Check for the 3rd highest, but avoid duplicates
			else if (num > third && num < second) {
				third = num;
			}
		}

		if (third == Integer.MIN_VALUE) {
			System.out.println("Not enough unique elements for top 3.");
		} else {
			System.out.println("1st Highest Element: " + first);
			System.out.println("2nd Highest Element: " + second);
			System.out.println("3rd Highest Element: " + third);
		}
	}
}
