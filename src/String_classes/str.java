  package String_classes;

public class str {

	public static void main(String[] args) {
		String s="AdhiPrince";
	System.out.println("1.string to array");
	char[]ch=s.toCharArray();
	for(int i=0;i<ch.length;i++)
		{
		    
			System.out.println(ch[i]);
		}
	
	System.out.println("2.charAt:"+s.charAt(4));
	System.out.println("3.uppercase:"+s.toUpperCase());
	System.out.println("4.lowercase:"+s.toLowerCase());
	System.out.println("5.cocat:"+s.concat("prii"));
	System.out.println("6.contains:"+s.contains("s"));
	System.out.println("7.to find index of characters:"+s.indexOf('i'));
	System.out.println("8.substring:"+s.substring(4));
	System.out.println("9.int index:"+s.indexOf("c"));
	System.out.println("10.substring start and end index:"+s.substring(3, 5));
	System.out.println("11.endwith:"+s.endsWith("f"));
	System.out.println("12.startswith:"+s.startsWith("A"));
	System.out.println("13.trim:"+s.trim());
	System.out.println("14.equals:"+s.equals("Adhi"));
	System.out.println("15.equals ignore:"+s.equalsIgnoreCase("adhiprince"));
	System.out.println("16.compare:"+s.compareTo("A"));
	System.out.println("17.hashcode:"+s.hashCode());
	System.out.println("18.length:"+s.length());
	
	
	
	}

}
