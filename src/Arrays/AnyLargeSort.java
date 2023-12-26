package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AnyLargeSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int size=sc.nextInt();
		int[]a=new int[size];
		System.out.println("Before sorting arrays values :-");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("After sorting array values :-");
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("Enter the place of largest number you want :-");
		int n=sc.nextInt();
		System.out.println("The "+n+" place of largest numbers is :-  "+a[size-n]);

	}

}
