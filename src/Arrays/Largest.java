package Arrays;

import java.util.Scanner;

public class Largest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of elements");
		int size=sc.nextInt();
		int[] a=new int[size];
		System.out.println("enter the"+size+"elements");
		
		for (int i=0;i<a.length;i++)
		{
		a[i]=sc.nextInt();	
		}
		int largest=a[0];
		for (int i=0;i<a.length;i++)
		{
		  if(a[i]>largest);
		  {
			 largest=a[i];
		  }
		}
		System.out.println("the largest num is"+largest);
		
	}

}
