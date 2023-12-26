package ArraysList;

import java.util.ArrayList;

public class SeachElement {

	public static void main(String[] args)
	{
		ArrayList a1=new ArrayList();
		a1.add("Adhi");
		a1.add("Shivu");
		ArrayList a2=new ArrayList();
		a2.add("Adhi");
		a2.add("Basava");
		System.out.println(a1.contains("Shivu"));//contains(object)
		System.out.println(a1.containsAll(a2));//containsAll(collection c)
		System.out.println(a1.indexOf("Adhi"));//indexof(object)
	}

}
