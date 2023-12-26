package exception_Handling;

import java.util.Scanner;

public class Try {

	public static void main(String[] args) {
		try {Scanner sc=new Scanner(System.in);
	    System.out.println("enter the value of a:");
	    int a=sc.nextInt();
	    System.out.println("enter the value of b");
	    int b=sc.nextInt();
	    int c=a/b;
	    System.out.println("the result is :"+c);
	    
			
		} catch (RuntimeException e) {
			System.out.println("dont pass zero");
		}
		finally
		{
			System.out.println("thank you");
		}
   
    

	}

}
