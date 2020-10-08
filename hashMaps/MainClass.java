package hashMaps;
import java.util.*;
import java.util.Map.Entry;

public class MainClass {

	public static void main(String[] args) {
		Map<String, Integer> numbers = new HashMap<>();
		numbers.put("one", 1);
		numbers.put("five", 5);
		numbers.put("three", 3);
		numbers.put("four", 4);
		
		//putAll function is used below;
		
//		Map<String, Integer> number = new HashMap<>();
//		number.put("one", 1);
//		number.put("two", 2);
//		number.put("three", 3);
//		System.out.println(numbers);
//		numbers.putAll(number);
		
		//putIfAbsent function is used below;
		
//		numbers.putIfAbsent("two", 2);
//		numbers.putIfAbsent("one", 10);
		
		//get function is used below;
		
//		System.out.println(numbers.get("one"));
//		System.out.println(numbers.get("nine"));
//		System.out.println(numbers.get("five"));
		
		//containsKey function is used below;
		
//		System.out.println(numbers.containsKey("one"));
//		System.out.println(numbers.containsKey("twenty"));
//		System.out.println(numbers.containsKey("three"));
		
		//containsValue function is used below;
		
//		System.out.println(numbers.containsValue(5));
//		System.out.println(numbers.containsValue(10));
//		System.out.println(numbers.containsValue(4));
		
		//replace function is used below;
		
//		System.out.println(numbers.replace("one", 10));
//		System.out.println(numbers.replace("two", null, 2));
//		System.out.println(numbers.replace("two", 1));
//		System.out.println(numbers.replace("three", 3, 3));
		
		//remove function is used below;
		
//		System.out.println(numbers.remove("one"));
//		System.out.println(numbers.remove("two", 2));
//		System.out.println(numbers.remove("two"));
//		System.out.println(numbers.remove("five", 2));
//		System.out.println(numbers.remove("five", 5));
		
		//values function is used below;
		
		System.out.println(numbers.values());
		
		//keySet function is used below;
		
		System.out.println(numbers.keySet());
		
		//entrySet function is used below;
		
		System.out.println(numbers.entrySet());
		System.out.println(numbers);
		
		//use of Entry class using set;
		
		Set<Entry<String, Integer>> entries = numbers.entrySet();
		for(Entry<String, Integer> entry : entries) {
			System.out.println(entry.getValue()*100);
		}
		System.out.println(numbers);
		
		//use of Entry class;
		
//		for(Entry<String, Integer> entry : numbers.entrySet()) {
//			System.out.println(entry.getValue()*100);
//		}
//		System.out.println(numbers);
		
	}

}
