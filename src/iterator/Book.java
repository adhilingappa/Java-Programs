package iterator;

public class Book {
	String name;
	double price;
	Book(){}
	Book(String name,double price)
	{
		this.name=name;
		this.price=price;
	
	}
	public String toString()
	{
		return name+"   "+price;
	}

}
