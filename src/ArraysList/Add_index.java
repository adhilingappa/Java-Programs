package ArraysList;

import java.util.ArrayList;

public class Add_index {

	public static void main(String[] args)
	{
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(3,50);
		System.out.println(a1);
		System.out.println(a1.size());
		ArrayList a2=new ArrayList();
		a2.add(70);
		a2.add(60);
		a1.addAll(2, a2);
		System.out.println(a1);
	

	}

}
