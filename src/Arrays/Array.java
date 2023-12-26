package Arrays;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ennter the size");
		int size=sc.nextInt();
	   String [] a= new String[size];
		System.out.println("enter the " +size+ "elements");
		for (int i=0;i<a.length;i++)
		{
			a[i]=sc.next();
		}
		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
