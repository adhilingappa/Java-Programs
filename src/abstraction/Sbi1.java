package abstraction;

public class Sbi1
{
	double bal=0.0;
	public void deposit(double amt)
	{
		bal=bal+amt;
		System.out.println("successfully deposited");
	}
	public void withdrwal(double amt1)
	{
	 if(amt1<=bal)
	 {
		 bal=bal-amt1;
		 System.out.println("succesfully withdrawl");
	 }
	 else
		 System.out.println("insuffient amt");
	}
	public double check()
	{
		return bal;
	}

}
