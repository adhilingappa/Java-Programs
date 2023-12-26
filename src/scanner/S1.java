package scanner;

import java.util.Scanner;

public class S1
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the num");
		int b=sc.nextInt();
	    even(b);
	    odd(b);
	    


	}

     static void even(int b) 
     {
    	 System.out.println(" evn num is");
    	 for(int a=1;a<=b;a++)
    	 {
    		 if (a%2==0)
    		 {
    		 System.out.println(a);
    	 }}
     }

       static void odd(int b) 
         {
    	   System.out.println("odd num is");
        	 for(int a=1;a<=b;a++)
        	 {
        		 if (a%2==1)
        		 {
        		 System.out.println(a);
        	       }
            }
    	}

}
