package JavaBasics;

public class DemoWrapper {
	public static void main(String[] args) {
		
		
		Double salPackage = new Double(50000.75); //wrapper class											
		
		Double salPak = 750000.75; //wrapper class
		
		System.out.println(salPackage);
		
		System.out.println(salPak);
		
		double sal = salPak; //auto unbox
		
		System.out.println(sal);
	}
}
