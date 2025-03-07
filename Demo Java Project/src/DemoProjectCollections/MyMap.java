package DemoProjectCollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyMap {
	public static void main(String[] args) {
		
		HashMap<String, Double> hm = new HashMap<String, Double>();
		hm.put("Amit", 1000.00);
		hm.put("Sudha", 6000.00);
		hm.put("Naman", 3000.00);
		hm.put("Aryan", 7000.00);
		hm.put("shreyash", 15000.00);
		hm.put("Anshuman", 9000.00);
		
		Set<Map.Entry<String , Double>> set = hm.entrySet();
		for(Map.Entry<String, Double> entry: set) {
			System.out.print(entry.getKey()+": ");
			System.out.println(entry.getValue());
		}
	}
}
