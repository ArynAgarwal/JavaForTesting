package DemoProjectInheritance;

public class TestShape {
	public static void main(String[] args) {
		shape sh;
		
		sh = new triangle(); //Dynamic polymorphism 
		
		sh.calcAreaofShape();
		
		triangle t = new triangle();
		
		t.areaTri();
		
		sh = new square();
		sh.tellMeShape("The shape is: ");
		sh= new shape();
		sh.tellMeShape("shape is generic");
	}
}
