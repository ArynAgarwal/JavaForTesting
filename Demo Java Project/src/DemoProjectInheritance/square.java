package DemoProjectInheritance;

public class square extends shape{
	public square() {
		System.out.println("A square is being constructed.");
	}
	protected void tellMeShape(String Shape) {
		System.out.println("The shape is: "+Shape+" is squared now...");
	}
	
}
