package iterator;
import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1 {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("adhi");
		a1.add("shivu");
		a1.add("basava");
		a1.add("anand");
		Iterator i=a1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	
		
	
	}
}
