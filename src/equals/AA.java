package equals;

public class AA {
	int accno;
	String name;
	AA(){}
	AA(int accno,String name)
	{
		this.accno=accno;
		this.name=name;
	}
   public String toString()
   {
	   System.out.println("the accno "+accno);
	   System.out.println("the name  "+name);
	return "  ";	   
   }
   public boolean equals(Object o)
   {
	  AA a1=(AA)o;
	return this.accno==a1.accno&&this.name==a1.name;
   }
}
