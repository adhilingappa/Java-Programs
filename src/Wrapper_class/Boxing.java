      package Wrapper_class;

public class Boxing {
	public static void main(String[] args) {
		int a=10;
		System.out.println(a);
		Integer i=a;
		Integer i1=Integer.valueOf(a);//explicit way0
		System.out.println(i.toString());
		String s="12a";
		int b=Integer.parseInt(s);
		System.out.println(b);
	}
}
