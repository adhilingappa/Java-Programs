package javapractice;

import java.util.Arrays;
import java.util.Scanner;

public class A1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		String []s=new String[size];
		System.out.println("enter the elements");
	    for(int i=0;i<s.length;i++) 
		{
		s[i]=sc.next();
		}
	    Arrays.sort(s);
		System.out.println("after sorting");
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
			
		}
	}
}
