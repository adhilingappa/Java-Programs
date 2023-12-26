package String;

public class S3 {
public static void main(String[] args) {
	StringBuilder s1= new StringBuilder();
	StringBuilder s2=s1;
	s1.append("adhi");
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s1.equals(s2));
	System.out.println(s1);
	System.out.println(s1==s2);
	s2=s2.append("pri");
	System.out.println(s2);
	System.out.println(s1);
	System.out.println(s1.equals(s2));
}
}
