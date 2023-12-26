package Demo1;

public abstract class Oops1 {
	private double bal;
	String name;
	int accno;
	Oops1(){}
	Oops1(String name,int accno,double sal)
	{
		this.name=name;
		this.accno=accno;
		this.bal=bal;
		
	}
	public abstract void deposit(double amt);
	public abstract void withdrawl(double amt);
	public abstract double check_bal();
	
}
