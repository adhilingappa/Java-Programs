package Arrays;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of elements");
		int size=sc.nextInt();
		int[] a=new int[size];
		System.out.println("enter the"+size+"elements");
		for (int i=0;i<a.length;i++)
		{
		a[i]=sc.nextInt();	
		}
		for (int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("the sum array no is "+sum);
		
	}

}
