package EarlyBinding;

public class Book
{
	String brand;
	double price;
	Book(){}
	Book(String brand,double price)
	{
		this.brand=brand;
		this.price=price;
	}
	Page p=new Page(300,"white");
    public void display()
    {
    	System.out.println("no of pages:"+p.no_pages);
    	System.out.println("type of book:"+p.type);
    	System.out.println("book brand:"+brand);
    	System.out.println("book price:"+price);
    }
}
