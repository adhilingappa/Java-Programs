package abstraction;

public class Machine{
	static double bal=10000;

	
	public double withdraw(double amt) {
		if (amt<=bal)
		{
			bal=bal-amt;
			System.out.println("succesfully withdrawl");
		}
		else 
		{
			System.out.println("insufficent funds");
			
		}
		return bal;
	}

	
	public double deposit(double amt) {
		bal=bal=amt;
		System.out.println("succesfully deposited");
		
		return bal;
	}

	 
	public double bal_check() {
		System.out.println(bal);

		return bal;
	}

}
