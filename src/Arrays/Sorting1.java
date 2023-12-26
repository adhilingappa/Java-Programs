package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting1 {

	public static void main(String[] args) {
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
	System.out.println("largest :"+a[size-3]);
	}
	

}
