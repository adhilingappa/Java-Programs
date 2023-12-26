package javapractice;

public class Abc1 extends Abc{
	private int accno;
	private String name;
	private double bal;
	Abc1(){}
   Abc1 (int accno,String name,double bal){
    	this.accno=accno;
    	this.name=name;
    	this.bal=bal;
    }
	void withdrawl(double amt) 
	{
		if(amt<=bal)
		{
			System.out.println("succesffull withdrwal");
			bal=bal-amt;
		}
		else
			System.out.println("insufficent");
		
	}

	 double getBal() {
		return bal;
	}

      void setBal(double amt) {
		this.bal = amt;
	}
	
}
