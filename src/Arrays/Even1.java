package Arrays;

import java.util.Scanner;

public class Even1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int []a=new int[size];
		System.out.println("enter the elements");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
			
		}
		System.out.println("even num in array list is");
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2==1)
			{
				System.out.println(a[i]);
			}
			
		}
		
		

	}

}
