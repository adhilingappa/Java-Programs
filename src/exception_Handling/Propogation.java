package exception_Handling;

public class Propogation {

	public static void main(String[] args) {
		System.out.println("start");
		adhi();
		System.out.println("end");
		
	}
  
	private static void basava() 
	{
		try {
			System.out.println("hii basava");
			adithya();
			System.out.println("hii adhi");
			
		} catch (Exception e)
		{
			System.out.println("handledd");
		}
		}
			
		

	private static void adithya()
	{
		System.out.println("hii adhi");
		int a=10;
		int b=0;
		int c=a/b;
		System.out.println("byee adhi");
	
	}

	private static void adhi() 
	{
		System.out.println("hii adithya");
		basava();
		System.out.println("hlo basava");
		
	}

}
