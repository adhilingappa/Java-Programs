package Arrays;

import java.util.Scanner;

public class Find3 {

	public static void main(String[] args) {
	
    int []a= {32,23,45};
	   int 	large1=a[0];
	   if(a[1]>large1) {
		   large1=a[1];
	   }
	   if(a[2]>large1) {
		   large1=a[2];
	   }
	   System.out.println("the largest num is:"+large1);
	}

}
