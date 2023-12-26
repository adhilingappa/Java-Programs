package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Book_driver {
	public static void main(String[] args) {
		ArrayList b=new ArrayList();
		b.add(new Book("classmate",80));
		b.add(new Book("vidya",50));
		b.add(new Book("doms",60));
		for(int i=0;i<b.size();i++)
		{
			Book b1=(Book)b.get(i);
			if(b1.name.equalsIgnoreCase("vidya"))
			{
				b.remove(i);
			}
		}
		System.out.println(b);
	}

}
