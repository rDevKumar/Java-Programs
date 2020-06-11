

import java.util.*;

public class Sets {

	public static void main(String[] args) {
		/*use below to perform operations in constant time*/
		Set<String> s = new HashSet<>();    
		/*use below to store data as in order of giving input*/
//		Set<String> s = new LinkedHashSet<>();
		/*use below to store data in sorted order*/
//		Set<String> s = new TreeSet<>();
		Set<String> b = new HashSet<>();
		System.out.println(s.add("Banana"));
		s.add("Apple");
		s.add("Kiwi");
		System.out.println(s.add("Banana"));
		s.add("Mango");
		System.out.println(s);
		System.out.println(s.contains("Apple"));
		b.add("Apple");
		b.add("Kiwi");
		System.out.println(s.containsAll(b));
		b.add("fruit");
		System.out.println(b);
		System.out.println(s.containsAll(b));
		s.retainAll(b);
		System.out.println(s);
		s.addAll(b);
		System.out.println(s);

	}

}
