package Throw;

import java.util.Scanner;

public class Num_check 
{
	public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the num");
	  long n=sc.nextLong();
		Num(n);
	}
	public static void Num(long n)
	{
		int count=0;
		while(n>0)
		{
			n=n/10;
			count++;
		}
		System.out.println(count);
		try {
			if(count==10)
			{
				 System.out.println("num have 10 digit");
			}
			else
			{
				throw new NumException();
			}
			
		}
		catch ( NumException e)
		{
			System.out.println("num is less than 10 digit");
		}
		
	}

  


}
