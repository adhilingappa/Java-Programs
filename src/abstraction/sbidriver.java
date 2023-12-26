package abstraction;

import java.util.Scanner;

public class sbidriver {

	public static void main(String[] args) 
	{
		Sbi1 s1=new Sbi1();
		Scanner sc= new Scanner(System.in);
		System.out.println("welcome to Atm");
		System.out.println("------------------");
		System.out.println("1.deposit");
		System.out.println("2.withdrwal");
		System.out.println("3.bal chech");
		System.out.println("enter the number");
		int a=sc.nextInt();
		switch(a)
		{
		case 1:
			System.out.println("enter the amt");
			double amt=sc.nextDouble();
			s1.deposit(amt);
			break;
		case 2:
			System.out.println("enter the amt");
		    double amt1=sc.nextDouble();
		    s1.withdrwal(amt1);
		    break;
		case 3:
			System.out.println(s1.check());
			
		}
		
		
		

	}

}
