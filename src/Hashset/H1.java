package Hashset;

import java.util.HashSet;

public class H1 {
	public static void main(String[] args) {
		HashSet h=new HashSet();
		h.add("hii");
		h.add(20);
		System.out.println(h);
	HashSet h2=new HashSet();
	h2.add(30);
	h.addAll(h2);
	System.out.println(h);
	}

}
