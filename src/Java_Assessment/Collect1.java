package Java_Assessment;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Collect1 {

	public static void main(String[] args) {
		Map<String,Integer> d= new HashMap<>();	
		 d.put("c", 2);
		 d.put("b", 3);
		 d.put("a", 3);
		 d.put("c", 4);
		 System.out.println(d);
	     System.out.println(d.get("a"));
	     System.out.println(d.size());
	     System.out.println(d.keySet());
	     System.out.println(d.values());
	     System.out.println(d.containsKey("c"));
	     System.out.println(d.containsValue(5));
	     Set<Entry<String, Integer>> db = d.entrySet();
	        for (Entry<String, Integer> user : db) {
				System.out.println(user);
			}
}}
