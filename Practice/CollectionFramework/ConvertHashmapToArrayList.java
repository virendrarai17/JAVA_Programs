package CollectionFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ConvertHashmapToArrayList {

	public static void main(String[] args) {
		
		HashMap<String, Integer> compList=new HashMap<String, Integer>();
		compList.put("Walmart", 1000);
		compList.put("TCS", 15000);
		compList.put("Infosys", 3000);
		compList.put("Sopra Steria", 10000);
		
		System.out.println(compList.size());
		
		Iterator<Map.Entry<String,Integer>> itr=	compList.entrySet().iterator();
		while(itr.hasNext()) {
		
		Map.Entry<String,Integer> pairs=itr.next();
		
		System.out.println("Key"+pairs.getKey()+ "Value="+pairs.getValue());
		
		
	}
		System.out.println("--------Iterate using lamda function--------------");
		
		compList.forEach((k,v)->System.out.println("Key="+k +"Value="+v));
		
		System.out.println("---Convert hashmap to arrayList--");
		
		ArrayList<String> alKey=new ArrayList<String>(compList.keySet());
		System.out.println("------CompanynameList------");
		for(String compname:alKey) {
			System.out.println(compname);
		}
		
		ArrayList<Integer> value=new ArrayList<Integer>(compList.values());
		System.out.println("----Employe Strength------");
		for(Integer i:value) {
			System.out.println(i);
		}
		

	}

}
