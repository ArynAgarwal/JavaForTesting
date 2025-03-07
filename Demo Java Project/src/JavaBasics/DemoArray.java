package JavaBasics;

public class DemoArray {
	
	public void FourDArray() {
		
	}
	
	public void ThreeDArray() {
		int [][][]ar;
		
		ar = new int[2][2][3];
		
		ar[0][0][0]=1; ar[0][0][1]=2; ar[0][0][2]=3;
		ar[1][1][0]=4; ar[1][1][1]=5; ar[1][1][2]=6;
		
		for(int k=0;k<2;k++) {
			for(int i=0;i<2;i++) {
				for(int j=0;j<3;j++) {
					System.out.print(ar[k][i][j]+" ");
					
				}
				System.out.println();
			}
			System.out.println("------------------------------");
		}
	}
	
	public void impTwoDArray() {
		
		int [][]ar;
		
		ar = new int[2][3];
		
		ar[0][0]=1; ar[0][1]=2; ar[0][2]=3;
		ar[1][0]=4; ar[1][1]=5; ar[1][2]=6;
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(ar[i][j]);
				
			}
			System.out.println();
		}
		System.out.println("------------------------------");
	}
	
	public void ImplementArrays() {
		int []arr; //arr is the reference variable
		
		int ar[];	//ar is the reference variable
		
		ar = new int [4];
		
		//int ar[] = new int[5];	
		
		ar[0] = 10; ar[1]=20;ar[2]=30;ar[3]=40;
		
		for(int i=0;i<4;i++) {
			System.out.println(ar[i]);
		}
		System.out.println("------------------------------");
		for(int i:ar)
			System.out.println(i);
		
		System.out.println("------------------------------");
	}
	
	public static void main(String[] args) {
		
		DemoArray da = new DemoArray();
		da.ThreeDArray();
		da.impTwoDArray();
		da.ImplementArrays();
	}
}
