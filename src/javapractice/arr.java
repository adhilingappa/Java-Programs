package javapractice;

import java.util.Arrays;
import java.util.Scanner;

public class arr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the siz eof arrays");
		int size=sc.nextInt();
		String []s=new String[size];
		System.out.println("enter the values");
		for (int i = 0; i < s.length; i++) {
			s[i]=sc.next();
			
		}
		System.out.println("before sorting ");
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
			
		}
		System.out.println("after sorting");
		Arrays.sort(s);
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		
	}

}
