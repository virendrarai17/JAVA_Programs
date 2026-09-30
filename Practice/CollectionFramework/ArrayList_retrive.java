package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_retrive {

	public static void main(String[] args) {
		
		ArrayList<Object> al=new ArrayList<Object>();
		al.add("Testing");
		al.add(100);
		al.add(10.10);
		al.add(false);
		
		System.out.println(al.get(2));
		System.out.println(al.size());
		
		//iterate using for loop
		System.out.println("******iterate using for loop\n");
		for(int i=0; i<=al.size()-1; i++) {
			System.out.println(al.get(i));
		}
		
		//iterate using foreach
		System.out.println("iterate using foreach*****\n");
		for(Object a:al) {
			System.out.println(a);
		}
		
		//Iterate using steam api using lamda expression
		System.out.println("iterate using stream api *****\n");
		al.stream().forEach(ele->System.out.println(ele));
		
		//iterate using Iterator interafce
		System.out.println("Iterate using Iterator interace\n");
		Iterator<Object> itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
