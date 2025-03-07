package DemoPackageExceptions;

public class CalcRate {
	int quantity,price,rate;
	
	public CalcRate() {
		quantity = 1;
		price = rate = 0;
	}
	
	public void tellRate(int qty,int prc) throws ArithmeticException, NullPointerException, Exception{
		quantity = qty; 
		
		rate = prc/0;
		/*
		 * try { rate = price/0;
		 * 
		 * } catch(ArithmeticException e) { System.out.println(e.getMessage());
		 * System.out.println("Let us do the Calc.."); rate=prc/quantity; }
		 * System.out.println("The Rate is: "+rate);
		 */
	}
	
	public static void main(String[] args) {
		CalcRate cRate = new CalcRate();
		try {
			cRate.tellRate(54, 151);
			System.out.println("Some other prcessing....");
		}
		catch(ArithmeticException e) {
			System.out.println("This is the first exc block...."+e.getMessage());
		}
		catch(NullPointerException e) {
			System.out.println("Now the null pointer excp is: "+e.getMessage());
		}
		catch(Exception e) {
			System.out.println("This is the second exc block..."+e.getMessage());
		}
		finally {
			System.out.println("Let us release the resources... CLose the database connections etc.....");
		}
		
		System.out.println("My program continues wiht the next set of instructions...");
	}
}
