package programming;

import java.util.Scanner;

public class evenORodd {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the num");
	int num=sc.nextInt();
	if(num%2==0)
		System.out.println("even");
	else
		System.out.println("odd");
}
}
