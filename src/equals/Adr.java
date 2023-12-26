package equals;

public class Adr {

	public static void main(String[] args) {
		AA a1=new AA(306,"adhi");
		System.out.println(a1);
		   System.out.println("================");
		AA a2=new AA(356,"iam");
		System.out.println(a2);
		   System.out.println("================");
        System.out.println(a2.equals(a1));
        System.out.println("================");
        AA a3=new AA(356,"am");
        System.out.println(a3);
        System.out.println("================");
        System.out.println(a2.equals(a3));
	}

}
