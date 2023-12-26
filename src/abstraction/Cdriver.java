package abstraction;

public class Cdriver {
	public static void main(String[] args) {
		Provider1 p1=new Provider1();
		System.out.println(p1.add(100, 200));
		System.out.println(p1.sub(100, 200));
		System.out.println(p1.mul(100, 200));
		System.out.println(p1.div(100, 200));
	}

}
