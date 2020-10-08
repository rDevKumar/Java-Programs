package hashMaps;
import java.util.*;
public class Question1GroupAnagrams {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		list.add("god");
		list.add("tac");
		list.add("dog");
		list.add("cat");
		list.add("act");
		Solution get = new Solution();
		System.out.println(get.getList(list));
	}
}

class Solution{
	List<List<String>> getList(List<String> s){
		Map<String, List<String>> map = new HashMap<>();
		for(String str : s) {
			char charArray[] = str.toCharArray();
			Arrays.parallelSort(charArray);
			String sorted = new String(charArray);
			if(!map.containsKey(sorted)) {
				map.put(sorted, new LinkedList<String>());
			}
			map.get(sorted).add(str);
		}
		return new LinkedList<>(map.values());
	}
}
