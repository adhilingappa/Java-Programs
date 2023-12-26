package get;

import java.util.ArrayList;

public class Book2 {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(new Book(80,"classmate"));
		a1.add(new Book(60,"vidya"));
		a1.add(new Book(50,"priii"));
		System.out.println(a1);
	  for (Object object : a1) {
		  System.out.println(object );
		
	}

	}

}
