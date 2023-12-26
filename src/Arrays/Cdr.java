package Arrays;

import java.util.Arrays;
import java.util.Iterator;

public class Cdr {

	public static void main(String[] args) {
      
		Compare[] c1=new Compare[4];
		c1[0]=new Compare(6,"MI","RED");
		c1[1]=new Compare(8,"RLME","BLACK");
		c1[2]=new Compare(4,"OPPO","BLUE");
		c1[3]=new Compare(8,"VIVO","GOLD");
		System.out.println(c1);
		for (int i = 0; i < c1.length; i++) {

		System.out.println(c1[i]);
		}
		Arrays.sort(c1);
		System.out.println("affter sorting");
		for (int i = 0; i < c1.length; i++) 
		{
			System.out.println(c1[i]);
		
			
		}
	}

}
