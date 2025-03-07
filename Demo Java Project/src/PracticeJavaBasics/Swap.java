package PracticeJavaBasics;

public class Swap {

	static int i=0;
	static int j=0;
	
	public static void s(int n1,int n2) {
		i=n1;
		j=n2;
		int temp=0;
		temp=i;
		i=j;
		j=temp;
		System.out.println("After swapping the numbers i and j respectively are: "+i+" and "+j);
	}
	
	public static void main(String[] args) {
		i=5;
		j=6;
		System.out.println("Before swapping the numbers i and j respectively are: "+i+" and "+j);
		s(i,j);
	}

}
