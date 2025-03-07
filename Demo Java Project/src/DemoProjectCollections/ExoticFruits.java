package DemoProjectCollections;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ExoticFruits extends Fruits{
	public static List<String> giveExoticFruits(){
		List<String> exFruits;
		exFruits = new LinkedList<String>();
		exFruits.add("Kiwi");
		exFruits.add("Kashmiri Apple");
		exFruits.add("Jack Fruit");
		exFruits.add("Dragon Fruit");
		
		return exFruits;
	}
	
	public static Collection<String> giveAllFruits(){
		Collection<String> fruits = new LinkedList<String>();
		List<String> fts = new LinkedList<String>();
		
		fts.add("Apple");fts.add("Grapes");fts.add("Bananas");
		fts.add(2,"Dry Fruits");
		fruits.addAll(fts);
		fruits.addAll(giveExoticFruits());
		
		return fruits;
	}
	
	
	public static void main(String[] args) {
		Collection c = giveAllFruits();
		
		Iterator i = c.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
