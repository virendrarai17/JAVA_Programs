import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementInStringArray {

	public static void main(String[] args) {
		// find duplicate elements in String Array
		// 1 by comparing objects to each other

		String[] names = { "Java", "PHP", "Azure", "Java", "PHP" };

		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {
				if (names[i].equals(names[j])) {
					System.out.println("Duplicate Element is:: " + names[i]);
				}
			}
		}
		System.out.println("***********");

		// 2. Using HashSet where adding duplicate element return false
		Set<String> name = new HashSet<String>();
		for (String ele : names) {
			if (name.add(ele) == false) {
				System.out.println("Duplicate element is:: " + ele);
			}
		}

		System.out.println("************");
		// 3. Using HashMap

		Map<String, Integer> storeMap = new HashMap<String, Integer>();
		for (String ele1 : names) {
			Integer count = storeMap.get(ele1);
			if (count == null) {
				storeMap.put(ele1, 1);
			} else {
				storeMap.put(ele1, ++count);
			}
		}
		// retrieve the element from this hashmap
		Set<Entry<String, Integer>> entryset = storeMap.entrySet();
		for (Entry<String, Integer> entry : entryset) {
			if (entry.getValue() > 1) {
				System.out.println("Duplicate value is " + entry.getKey());
			}
		}

	}

}
