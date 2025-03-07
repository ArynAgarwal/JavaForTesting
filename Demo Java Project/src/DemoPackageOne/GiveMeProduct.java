package DemoPackageOne;

public class GiveMeProduct {
	
	int i,j,product;
	
	public GiveMeProduct(String s) {
		System.out.println(s);
		i=j=1;
	}
	
	public int giveProduct(int n1, int n2){
		return n1*n2;
	}
	
	public void giveProduct(int n, int m,int result) {
		result = n*m;
		System.out.println("The Product will be..." + result);
	}

}
