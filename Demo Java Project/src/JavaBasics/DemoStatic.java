package JavaBasics;

public class DemoStatic {

	static int ix,jy,kz;
	
	public DemoStatic() {
		ix = jy = kz = 1;
		System.out.println("Default const is invoked....");
		System.out.println("ix= "+ix+"jy= "+jy+"kz = "+kz);
	}
	
	static {
		ix = 2; jy = 3;kz = 4;
		
		System.out.println("ix= "+ix+" jy= "+jy+" kz = "+kz);
	}
	
	public static void dispVariables() {
		int i,j,k;
		i=j=k=10;
		
		System.out.println("i= "+i+" j= "+j+" k = "+k);
	}
	
	public static void main(String[] args) {
		
		DemoStatic ds = new DemoStatic();
		System.out.println("JVM is calling me.");
		
		dispVariables();
		DemoStatic.dispVariables();
	}

}
