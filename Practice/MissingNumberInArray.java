
public class MissingNumberInArray {

	public static void main(String[] args) {
		// find missing number in sequence array, here missing number is 6
		// sum of array - sum of total sequence number

		int[] a = { -2, -1,0, 1, 2, 3, 4, 5, 7, 8, 9, 10 };
		int sum = 0;

		for (int i : a) {
			sum += i;
		}

		System.out.println("Sum of array " + sum);

		int sum1 = 0;

		for (int j = -2; j <= 10; j++) {
			sum1 += j;
		}
		System.out.println("Sum of total number " + sum1);
		System.out.println("Missing number is " + (sum1 - sum));
	}

}