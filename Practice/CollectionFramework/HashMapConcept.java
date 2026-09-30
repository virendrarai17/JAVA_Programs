package CollectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		// No oredring- no indexing
		//stores value key value pair
		//key can not be null
		//multiple null value can be stored but only 1 null key
		//hashmap is not threadsafe- unsynchronized
		
		HashMap<String, String> capitolMap=new HashMap<String, String>();
		capitolMap.put("India", "delhi");
		capitolMap.put("USA", "washington DC");
		capitolMap.put("MP", "Bhopal");
		capitolMap.put(null, "patna");
		capitolMap.put(null, "ranchi"); // recent null key accepted 
		capitolMap.put("Bihar", null);
		capitolMap.put("UP", null);
	
		System.out.println(capitolMap);
		
	 // Iterator using keyset-retrun set of keys
		
		Iterator<String> itr=capitolMap.keySet().iterator();
		while(itr.hasNext()) {
			String key=itr.next();
			String value=capitolMap.get(key);	
			System.out.println("key="+key + "value="+ value);
		}
		
		// Iterator using entryset-in the pair of key value
		System.out.println("Iterator using entryset\n");
		Iterator<Entry<String,String>> entry=capitolMap.entrySet().iterator();
		while(entry.hasNext()) {
			Entry<String,String> str=entry.next();
			System.out.println("Key"+ str.getKey()+ "Value"+ str.getValue());
		}
		
		// Using lamda function
		System.out.println("Using lamda function\n");
		capitolMap.forEach((k,v)->System.out.println("Key:"+k +"value"+v));

	}

}
