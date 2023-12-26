package object;

import java.util.Arrays;

public class objDriver {

	public static void main(String[] args) 
	{
		obj1 []a=new obj1[3];
		a[0]=new obj1(123,20000,"shivu");
		a[1]=new obj1(225,25000,"anand");
		a[2]=new obj1(306,30000,"adhi");
		System.out.println("before sortiing");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
		}
		Arrays.sort(a);
		System.out.println("aftre sorting");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
		}

	}

}
