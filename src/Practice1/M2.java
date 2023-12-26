package Practice1;

public class M2 {
	public static void main(String[] args) {
		add(10);
	}

	public  static void add(int i)
	{
		System.out.println(i);
		i--;
		if(i==0)
		{
		  return;
		}
		add(i);
		
	}

}
