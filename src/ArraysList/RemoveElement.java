package ArraysList;

import java.util.ArrayList;

public class RemoveElement {

	public static void main(String[] args)
	{
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(40);
		a1.add(60);
		a1.add(50);
		System.out.println(a1);
		System.out.println(a1.get(2));
		a1.remove(2);
		System.out.println(a1);//remove int 
       ArrayList a2=new ArrayList();
       a2.add(20);
       a2.add(90);
       a2.add(60);
       a1.removeAll(a2);//removeAll(collection c)
       System.out.println(a1);
       a1.retainAll(a2);
       System.out.println(a1);//retainAll(collection c)
       
		
		
	}

}
