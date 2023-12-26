package programming;

import java.util.Scanner;

public class Specialdigit {
	public static void main(String[] args) {
		int count=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the num");
		int num=sc.nextInt();
		while(num>0)
		{
			num=num/10;
			count++;
		}
		if(count==2)
			System.out.println("num is special two digit");
		else
			System.out.println("num is not specail two digit");
	}

}
