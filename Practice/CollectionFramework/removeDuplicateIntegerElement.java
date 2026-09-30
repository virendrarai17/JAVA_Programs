package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class removeDuplicateIntegerElement {

	public static void main(String[] args) {
		
		// First way of removing duplicates
		ArrayList<Integer> al=new ArrayList<Integer>(Arrays.asList(1,1,2,3,4,5,7,8,9,6,4,3,2,1,8,9));
		System.out.println(al); // arraylist with duplicates element
		
		LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>(al);
		System.out.println(lhs); // linkedhashset without duplicate
		
		ArrayList<Integer> alwithoutDuplicate=new ArrayList<Integer>(lhs);
		System.out.println(alwithoutDuplicate);
		
		//2nd way using stream api
		ArrayList<Integer> duplicatelist=new ArrayList<Integer>(Arrays.asList(1,1,2,3,4,5,7,8,9,6,4,3,2,1,8,9));
		System.out.println(duplicatelist); // arraylist with duplicates element
		
		List<Integer> withoutduplicates=duplicatelist.stream().distinct().collect(Collectors.toList());
		System.out.println(withoutduplicates);
	}

}
