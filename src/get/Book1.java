package get;

import java.util.ArrayList;
import java.util.Iterator;

public class Book1 {

	public static void main(String[] args)
	{
		ArrayList a1=new ArrayList();
		a1.add(new Book(80,"classmate"));
		a1.add(new Book(60,"vidya"));
		a1.add(new Book(50,"priii"));
		System.out.println(a1);
	  for (int i = 0; i < a1.size(); i++) {
			System.out.println(a1.get(i));
		}
	  for (int i = 0; i <a1.size(); i++)
	  {
	       Book b=(Book)a1.get(i);
		  if(b.brand.equalsIgnoreCase("vidya"))
				  {
			       a1.remove(b);
				  }
		}
	  System.out.println("======================");
		for (int a = 0; a< a1.size(); a++) {
			System.out.println(a1.get(a));
	}
		

	}

}
