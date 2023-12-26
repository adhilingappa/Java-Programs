package multipleinheritance;

public   class Machine implements Deposit,Withdrawl
{
	double bal=10000;
	public void  deposit(double amt)
	{
		bal=bal+amt;
		System.out.println("succesfully deposit");

	}
	public void withdrawl(double amt)
	{
		if(amt<=bal)
		{
			bal=bal-amt;
			System.out.println("succesfully withdrawl");
		}
		else 
		{
			System.out.println("insuffient amount");
		}
	}
	
}
