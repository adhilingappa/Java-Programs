package Inheritance;

public class Acc {
	int accno;
	String name;
	String branch;
	Acc(int accno,String name,String branch)
	{
		this.accno=accno;
		this.name=name;
		this.branch=branch;
    }
	public void display()
	{
		System.out.println("accno is:"+accno);
		System.out.println("username name:"+name);
		System.out.println("branch:"+branch);
	}
}
