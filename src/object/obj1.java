package object;

public class obj1 implements Comparable
{
  int id;
  double sal;
  String name;
  obj1(){};
  obj1(int id,double sal,String name)
  {
	  this.id=id;
	  this.sal=sal;
	  this.name=name;
  }
  public String toString()
  {
	  return "  "+id+"  "+sal+"   "+name;
  }
  public int compareTo(Object o) {
	  obj1 a1=(obj1)o;
		return this.name.compareTo(a1.name);
	}
		
	}
	

