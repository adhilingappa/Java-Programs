package exception;

public class Driver {

	public static void main(String[] args) {
		try
		{
			/*E2 e3=new E3();//up
			System.out.println(e3.a); 
			E3 e1=(E3)e3;
			System.out.println(e1.b);
			System.out.println(e1.a);*/
			E3 a=(E3) new E2();//exception
			
		}
		catch (Exception e) 
		{
		System.out.println("handle");
		}
	}

}
