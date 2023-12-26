package abstraction;

import java.util.Scanner;

public class Adriver
{
	public static void main(String[] args) {
	Machine m1=new Machine();
	Scanner sc=new Scanner(System.in);
  System.out.println(" 1. withdrawl amount");
  System.out.println(" 2. deposit amount");
  System.out.println(" 3. amount check ");
  System.out.println("enter the num");
  int n=sc.nextInt();
  switch(n)
  {
  case 1:
  {
    System.out.println("enter the amount");
    double amt=sc.nextDouble();
    m1.withdraw(amt);  
  }
  case 2:
  {
	  System.out.println("enter the amount");
	  double amt=sc.nextDouble();
	  m1.deposit(amt); 
  }
  case 3:
  {
	  m1.bal_check();
  }
  }  
}
}


