
public class FibonacciSeries {

	public static void main(String[] args) {
        // Fibonacci sequence
        int pre = 0;
        int curr = 1;

        System.out.println(pre); // Print the first number
        System.out.println(curr); // Print the second number

        for (int i = 2; i < 10; i++) { // Adjust the loop to print 10 numbers in total
            int next = pre + curr;
            System.out.println(next);
            pre = curr;
            curr = next;
        }
    }
}