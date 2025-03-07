package DemoProjectInheritance;

public class triangle extends shape {
	public triangle() {
		super();//this implies calling the const of the parent/base class
		System.out.println("A trianglle is gonna be constructed.");
	}
	
	public void areaTri() {
		System.out.println("The area will be the half of the product of the height and base of the triangle.");
	}
}
