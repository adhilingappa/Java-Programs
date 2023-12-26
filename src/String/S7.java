package String;
 //StringBuilder constructer
public class S7 {

	public static void main(String[] args) {
		StringBuilder s1= new StringBuilder(5);
		System.out.println(s1.capacity());
		s1.append("Adhiprince");
		System.out.println(s1.capacity());
		s1=s1.append("priii");
		System.out.println(s1);
		System.out.println(s1.capacity());
		s1.append("13456789");
		System.out.println(s1);
		System.out.println(s1.capacity());

	}

}
