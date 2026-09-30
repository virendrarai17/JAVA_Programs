package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

	public static void main(String[] args) {
		
// 1. using Collections.synchronizedList
		
		List<String> names=Collections.synchronizedList(new ArrayList<String>());

		names.add("Tom");
		names.add("Peter");
		names.add("joolie");
		System.out.println(names);
		
		//for adding and remove the element synchronization not required
		// for fetch or traverse the element explicit synchonization required
		
		synchronized (names) {
		Iterator<String> itr=names.iterator();	
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		}
		
		//2 way using copyOnWriteArrayList
		
		CopyOnWriteArrayList<String> empname=new CopyOnWriteArrayList<String>();
		empname.add("Ajay");
		empname.add("Naveen");
		empname.add("rajiv");
		
	Iterator<String> itr1=empname.iterator();
	while(itr1.hasNext()) {
		System.out.println(itr1.next());
	}
		
	}

}
