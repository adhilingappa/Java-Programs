package String;

public class StringToChar {

	public static void main(String[] args) {
		String s1=new String("Adhi prince");
		char[]ch=s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		System.out.println(s1.charAt(4));
	}

}
