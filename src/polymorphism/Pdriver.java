package polymorphism;

public class Pdriver {

	public static void main(String[] args) {
		P2 obj=new P2();
		obj.odd();
		P1 obj1=(P1)obj;
		obj1.odd();
		
	}
}


 