package Arrays;

import java.util.Comparator;

public class Compare implements Comparable{
	String brand;
	String clr;
	int ram;
	Compare(){}
	Compare(int ram,String brand,String clr)
	{
		this.ram=ram;
		this.brand=brand;
		this.clr=clr;
	}
	public String toString()
	{
		System.out.println("the mobile ram:"+ram);
		System.out.println("the mobile brand:"+brand);
		System.out.println("the mobile clr:"+clr);
		return   "" ;
		
	}
		
	
	public int compareTo(Object o) {
		Compare c1=(Compare)o;
		return c1.brand.compareTo(c1.brand) ;
	}

}
