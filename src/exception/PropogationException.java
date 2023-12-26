package exception;

public class PropogationException {

	public static void main(String[] args) {
		System.out.println("story start");
		adhi();
		System.out.println("story end");
	}

	private static void adhi()
	{
		System.out.println("the adhi story start");
      basava();		
		System.out.println("the adhi story end ");
	}

	private static void basava() 
	
	{
		System.out.println("the basava story start");
		swamy();	
		System.out.println("the basava story end");
		
	}

	private static void swamy()
	{
		try {
			System.out.println("the swmay story start");
			int a=10;
			int b=0;
			int c=a/b;
			System.out.println("the swmay story end");
			
		} catch (Exception e) {
			System.out.println("handled");
	}
		
	
	}

}
