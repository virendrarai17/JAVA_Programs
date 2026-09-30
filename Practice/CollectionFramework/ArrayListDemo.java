package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {

	public static void main(String[] args) {
		// Bydefault Virtual capacity of ArrayList is 10
		
		ArrayList<Object> al=new ArrayList<Object>();
		al.add("Test");
		al.add(100);
		al.add(10.22);
		al.add(true);
		
		System.out.println(al.size());// size of the arraylist
		System.out.println(al);//
		
		ArrayList<Object> al1=new ArrayList<Object>(20); // increased the virtual capacity to 20
		al1.add(500);
		al1.add("Java");
		System.out.println(al1);
		
		ArrayList<Integer> listInt=new ArrayList<Integer>();
		listInt.add(10);
		listInt.add(15);
		System.out.println(listInt);
		
		ArrayList<Object> al3=new ArrayList<Object>(Arrays.asList("java",123,10.12,false));
		System.out.println(al3);
	}

}
