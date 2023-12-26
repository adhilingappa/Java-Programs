 package exception;

import java.util.Arrays;
import java.util.Scanner;

public class E1 {

	public static void main(String[] args) {
  try {
	  Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		String[]a=new String[size];
		System.out.println("before sorting");
	for (int i=0;i<a.length;i++)
	{
		a[i]=sc.next();
  }
	Arrays.sort(a);
	System.out.println("after the sorting");
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
		
	}
	System.out.println(a[size ]);
	
	
}
  catch (Exception e) {
	  System.out.println("pass the size value n-1 ");
	  
  }
	

	}

}
