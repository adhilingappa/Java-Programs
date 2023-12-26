package programming;

import java.util.Scanner;

public class EvenORodd2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num");
		int num=sc.nextInt();
		if(num/2*2==num)
			System.out.println("the num is even");
		else 
			System.err.println("the num is odd");
	}

}
