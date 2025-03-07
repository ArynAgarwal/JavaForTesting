package PracticeJavaBasics;

public class DecimalToBinary {
	
	static int[] binaryNum = new int[1000];
	
	public static void btd(int n) {
		int i = 0;
        while (n > 0) 
        {
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }
 
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
 
	}
	
	public static void main(String[] args) {
		
		int n=17;
		System.out.println("Decimal num: "+n);
		
		System.out.println("Binary number: ");
		btd(n);

	}

}
