package DemoProjectCollections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class LetUsSort {
	public static void main(String[] args) {
		Set<Integer> sorted = new TreeSet<Integer>();
		
		sorted.add(56);sorted.add(101);sorted.add(1);
		
		System.out.println(sorted);
		
		Iterator i = sorted.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
