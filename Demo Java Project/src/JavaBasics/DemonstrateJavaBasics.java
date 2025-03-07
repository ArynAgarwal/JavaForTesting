package JavaBasics;

import DemoPackageOne.GiveMeSum;
import DemoProjectTwo.GIveMeModulus;
import DemoProjectTwo.GiveMeDifference;
import DemoPackageOne.*;

public class DemonstrateJavaBasics {
	
	private void dispWelcome() {
		System.out.println("You're welcome....");
	}
	
	public static void main(String[] args) {
		
		
		GiveMeDifference diff = new GiveMeDifference();
		
		GiveMeDifference diff1 = new GiveMeDifference("I am enjoying the difference...");
		
		GiveMeDifference diff2 = new GiveMeDifference("Third const is invoked.",100,200);
		
		GiveMeProduct prod = new GiveMeProduct("Product will be calculated.");
		
		int prd =prod.giveProduct(100,10);
		System.out.println("The Product of 100 and 10 is: " + prd);
		
		prod.giveProduct(10,20,1);
		
		int dif = diff.difference(40, 50);
		
		System.out.println("The difference is: "+ dif);
		/*
		 * GiveMeSum sum = new GiveMeSum(); GiveMeDifference diff = new
		 * GiveMeDifference(); GiveMeProduct prod = new GiveMeProduct(); GIveMeModulus
		 * mod = new GIveMeModulus();
		 */
		
//		new DemonstrateJavaBasics().dispWelcome();
		/* DemonstrateJavaBasics d;
		 * d = new DemonstrateJavaBasics(); d.dispWelcome();
		 * 
		 * System.out.println("Welcome to the world of Java");
		 * 
		 * for(String s : args) { System.out.print(s+" "); }
		 */
	}
	
}
