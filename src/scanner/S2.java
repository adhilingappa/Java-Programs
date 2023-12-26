package scanner;

import java.util.Scanner;

public class S2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num");
		int b=sc.nextInt();
		int c=1;
		int a=1;
	while(a<=10)
	{
		c=b+a;
		System.out.println(b+"*"+a+"="+c);
		a++;
	}
	}

}
