package ArraysList;

import java.util.ArrayList;

public class AddAll {

	public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add("MT");
	a1.add("SQL");
	ArrayList a2=new ArrayList();
	a2.add("JAVA");
	a2.add("SLNM");
	System.out.println(a2.size());
	a1.addAll(a2);
	System.out.println(a1);

	}

}
