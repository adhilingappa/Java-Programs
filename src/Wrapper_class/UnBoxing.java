package Wrapper_class;

public class UnBoxing {
	public static void main(String[] args) {
		Integer i=20;
		System.out.println(i);
		int a=i.intValue();//explicit
		int a1=i;//implicit
	}

}
