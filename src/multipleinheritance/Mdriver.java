package multipleinheritance;

import java.util.Scanner;

public class Mdriver {
	public static void main(String[] args) {
	Machine m1=new Machine();
	Scanner sc=new Scanner(System.in);
	System.out.println("1.deposit amount");
	System.out.println("2.withdrawl");
	int n=sc.nextInt();
	switch(n)
	{
	case 1:
	{
		System.out.println("enter  amount ");
		double amt=sc.nextDouble();
		m1.deposit(amt);
		break;
	}
	case 2:
	{
		System.out.println("enter amount ");
		double amt=sc.nextDouble();
		m1.withdrawl(amt);
	}
	}
	

	}

}
