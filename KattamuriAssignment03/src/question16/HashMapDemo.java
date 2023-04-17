package question16;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<String,Integer> m = new HashMap<String,Integer>();
		m.put("Sweety", 10);
		m.put("Nicy", 20);
		m.put("Alekhya", 15);
		m.put("Sowi", 17);
		m.put(null, null);
		System.out.print("Elements in Hashtable are:\n " + m.entrySet());
		System.out.println(m.get("Sweety"));
		System.out.println(m.get("Sowi"));
		}
}
