package iterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class List_iterator {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("Adhi");
		a1.add("swamy");
		a1.add("basu");
		ListIterator l=a1.listIterator();
		while(l.hasNext())
		{
			l.next();
		}
		while(l.hasPrevious())
		{
			System.out.println(l.previous());
		}
	}

}
