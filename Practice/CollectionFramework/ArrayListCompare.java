package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListCompare {

	public static void main(String[] args) {
		//1. compare 2 element in arraylist
		ArrayList<String> al1=new ArrayList<String>(Arrays.asList("A","B","C","D","E"));

		ArrayList<String> al2=new ArrayList<String>(Arrays.asList("A","E","C","D","B"));
		
			System.out.println(al1.equals(al2));// without sort o/p is false

			Collections.sort(al1);
			Collections.sort(al2);
			System.out.println(al1.equals(al2));// return true
			
			//2. compare two list and find out additional/missing element
			
			ArrayList<String> al3=new ArrayList<String>(Arrays.asList("A","B","C","D","E"));

			ArrayList<String> al4=new ArrayList<String>(Arrays.asList("A","F","C","D","B"));
			Collections.sort(al3);
			Collections.sort(al4);
			
//			al3.removeAll(al4);
//			System.out.println(al3); // output E
			
			al4.removeAll(al3);
			System.out.println(al4); //output F
			
			// compare 2 list and find out common element
			ArrayList<String> books1=new ArrayList<String>(Arrays.asList("Java","PHP","C#","python",".Net"));
			ArrayList<String> books2=new ArrayList<String>(Arrays.asList("Java","PHP","C#","python","Ruby"));
			books1.retainAll(books2);
			System.out.println(books1);
	}

}
