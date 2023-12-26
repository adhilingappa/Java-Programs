package programming;

import java.util.Scanner;

public class EvenORodd3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the num");
	int num=sc.nextInt();
	String res=(num%2==0?"even":"odd");
	System.out.println(res);
	
}
}
