package Inheritance;

public class SA extends Acc{
	int emi;
	int amt;
	SA(int accno,String name,String branch,int emi,int amt)
	{
		super(accno,name,branch);
		this.emi=emi;
		this.amt=amt;
	}
	public void display1()
	{
		super.display();
	    System.out.println("emi:"+emi);
	    System.out.println("amt:"+amt);
	}

}
