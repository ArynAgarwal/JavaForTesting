package DemoPackageExceptions;

public class FactoryApplication {
	public static void elligibleCandidates(int age) throws UserDefined_AgeException{
		if((age > 21) && (age<51)) {
			System.out.println("The candidate is eligible to work.");
		}
		else if(age<21) {
			throw new UserDefined_AgeException("Age cannot be < 21");
		}
	}
	
	public static void main(String[] args) throws UserDefined_AgeException{
		try {
			elligibleCandidates(18);
			
		}catch(UserDefined_AgeException e) {
//			System.out.println(e.getMessage()+" Coming from the factory app....");
//			new UserDefined_AgeException("Coming from the factory app....");
			System.out.println(e.getMessage());
		}
		elligibleCandidates(25);
	}
}
