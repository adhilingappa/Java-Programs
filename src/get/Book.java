package get;

public class Book 
{
double price;
String brand;
Book(){}
Book(double price,String brand)
{
	this.brand=brand;
	this.price=price;	
}
public String toString()
{
	return price+"   "+brand;
}

}
