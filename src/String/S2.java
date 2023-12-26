package String;

public class S2 {

	public static void main(String[] args) {
		String s1="adhi";
		String s2=s1;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		s2=s2.concat("pri");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);
	}

}
