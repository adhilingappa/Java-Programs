package Demo1;

 class A {
	private  int accno;
	private String name;
	private double bal;
	
	A(int accno,String name,double bal)
	{
		this.accno=accno;
		this.name=name;
		this.bal=bal;
	}
	void withdraw(double  amt)
	{
		if (amt<=bal)
		{
			bal=bal-amt;
			System.out.println("succesfull");
		}
		else
		{
			System.out.println("insufficent");
		}
	}
	void deposit(double amt)
	{
		bal=bal+amt;
	}
	
	double getBal() {
		return bal;
	}
    void setBal(double bal) {
		this.bal = bal;
	}
	
		
	}
 
 
