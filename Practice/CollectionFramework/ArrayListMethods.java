package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
		
//		ArrayList<String> al1=new ArrayList<String>();
//		al1.add("tom");
//		al1.add("Peter");
//		al1.add("Aditya");
//		al1.add("test");
//		
//		ArrayList<String> al2=new ArrayList<String>(Arrays.asList("testing", "Java"));
		
		//al1.addAll(al2);
		//System.out.println(al1); // addAll method combine both the list
		
//		al1.addAll(1, al2);
//		System.out.println(al1); // combined both the list from given index
//		
//		System.out.println(al1.contains("Peter")); //contains method return true if element present in the list
//		
//		ArrayList<String> cloneList=(ArrayList<String>)al1.clone(); // clone and store in a new list
//		System.out.println(cloneList);

//		al1.remove(2);// removed the element from second index
//		System.out.println(al1);
		
		//System.out.println(al1.lastIndexOf("Peter"));
		
		ArrayList<Integer> intList=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8));
//		intList.removeIf(num->num%2==0); // removed all the even number
//		System.out.println(intList);
//		intList.removeIf(num->(num%2)!=0); // removed all the odd number
//		System.out.println(intList);
		
//		ArrayList<Integer> sublist=new ArrayList(intList.subList(2, 5));
//		System.out.println(sublist);
	
		ArrayList<String> booklist=new ArrayList<String>(Arrays.asList("testing", "Java", "PHP","Maths","Java"));
		booklist.retainAll(Collections.singletonList("Java")); // retain the element and print only those element in the list
				System.out.println(booklist);
				
//		Object arr[]=booklist.toArray();
//		for(Object book:arr) {
//			System.out.println(book.toString());
//		}
				
		
				
	}

}
