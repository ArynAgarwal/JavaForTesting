package DemoProjectTwo;

public class GiveMeDifference {

	int i,j;
	
	public int difference(int n,int m) {
		int diff=0;
		
		if(n>m) {
			diff = n-m;
		}
		else if(n<m) {
			diff =m-n;
		}
		else if(n==m) {
			diff=0;
		}
		return diff; 
	}
	
	public GiveMeDifference() {
		System.out.println("Default const or default is called....");
	}
	
	public GiveMeDifference(String s) {
		System.out.println(s);
	}
	
	public GiveMeDifference(String s,int n1, int n2) {
		i=n1;
		j=n2;
		System.out.println(s + " " + n1 + " " + n2);
	}

}
