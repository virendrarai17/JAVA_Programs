import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintEvenNumber {

	public static void main(String[] args) {

		// Print only even number from given array list
		List<Integer> list=Arrays.asList(10,120,33,45,22,42,45,66);

		list.stream().filter(e -> e%2==0)
		.forEach(System.out::println);

	}

}
