package iterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class iterator2 {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		ListIterator l=a.listIterator(4);
		while(l.hasPrevious());
		{
			System.out.println(l.previous());
		}
	}

}
