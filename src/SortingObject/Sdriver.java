package SortingObject;

import java.util.Arrays;

public class Sdriver {

	public static void main(String[] args) {
		Stu[]s=new Stu[5];
		s[0]=new Stu("adhi",123);
		s[1]=new Stu("shivu",306);
		s[2]=new Stu("basava",254);
		s[3]=new Stu("anand",456);
		s[4]=new Stu("nithya",235);
		System.out.println("before sorting");
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		Arrays.sort(s);
		System.out.println("after sorting");
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
				

	}

}
