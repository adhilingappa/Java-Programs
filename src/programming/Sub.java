package programming;

import java.util.Scanner;

public class Sub {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the 4 sub marks  ");
    int sql=sc.nextInt();
    int mt=sc.nextInt();
    int java=sc.nextInt();
    int sel=sc.nextInt();
    System.out.println("enter the passing marks");
    int marks=sc.nextInt();
    if(sql>=marks&&mt>=marks&&java>=marks&&sel>= marks)
    	System.out.println("pass");
    else
    	System.out.println("fail");
	
}
}
