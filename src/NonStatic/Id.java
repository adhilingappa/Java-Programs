package NonStatic;

public class Id
{
String id;
String cname="AYS";
String Ename;
static int count=1;
long mob;
{
	id=cname+count++;
	}
Id(){}
Id(String Ename,long mob)
{
	this.Ename=Ename;
	this.mob=mob;
}
public void display()
{
	System.out.println("emp id:"+id);
	System.out.println("emp name:"+Ename);
	System.out.println("emp mob:"+mob);
	System.out.println("=================");
	
	
	}

}
