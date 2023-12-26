package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Large2 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size");
	int size=sc.nextInt();
	int[]a=new int[size];
	int large1=a[0];
	int large2=a[1];
	System.out.println("enter the elements");
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("after sorting");
	Arrays.sort(a);
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
		if(a[i]>large1)
		{
			large2=large1;
			large1=a[i];
		}
		else if(a[i]>large2)
		{
			large2=a[i];
		}
	}
	
System.out.println(" 2nd largest num is:"+large2);
	}

}
