package String_classes;

public class StringMethods {

	public static void main(String[] args) {
		String s1=new String("AdhiPrince");
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.compareToIgnoreCase("Adhiprince"));
		System.out.println(s1.concat("306"));
	
		System.out.println(s1.equalsIgnoreCase("Adhi"));
		System.out.println(s1.startsWith("A"));
		System.out.println(s1.endsWith("e"));
		System.out.println(s1.indexOf("P"));
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(4, 10));
		System.out.println(s1.indexOf('P'));
		
		
		
	}

}
