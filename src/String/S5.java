package String;

public class S5 {
	public static void main(String[] args) {
		char[]ch= {'A','d','h','i'};
		String s=" ";
		for(int i=0;i<ch.length;i++) {
			s=s+ch[i]; 
		}
		System.out.println(s);
		String s2=s;
		System.out.println(s==s2);
		System.out.println(s.equals(s2));
		s2=s2.concat("prince ");
		System.out.println(s);
		System.out.println(s2);
		
		
	}

}
