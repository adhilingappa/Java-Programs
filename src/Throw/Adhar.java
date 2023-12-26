    package Throw;

public class Adhar {
String name;
int age;
String Add;
int mob;
Adhar()
{}
Adhar(String name,int age,String Add,int mob)
{
	this.name=name;
	try {
		 if(age>=18)
		 {  
			 this.age=age;
		 }
		 else
		 {
			 throw new  AgeException();		 }
	}
	catch (RuntimeException e)
	{
		System.out.println("candidtate is not eligible(age should more than 18)");
	}
	  

     this.Add=Add;
     this.mob=mob;
 }
  public String toString()
   {
	 System.out.println("candidate name:"+name);
	 System.out.println("candidate age:"+age);
	 System.out.println("candidate Address:"+Add);
	 System.out.println("candidate mob num:"+mob);
	return " ";
   }
}