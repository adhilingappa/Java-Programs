package programming;

import java.util.Scanner;

public class EvenorOdd5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[]s= {"even","odd"};
		System.out.println("enter the num");
		int num=sc.nextInt();
		System.out.println(s[num%2]);
	}

}
