package DemoProjectCollections;

import java.util.ArrayList;
import java.util.Collection;

public class Fruits {
	
	public Collection giveFruits(Collection fruits) {
		fruits = new ArrayList<String>();
		
		fruits.add(new String("Apple"));
		fruits.add("Grapes");
		fruits.add("bananas");
		
		return fruits;
	}
	
}
