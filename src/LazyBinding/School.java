package LazyBinding;

public class School 
{
	String sname;
	School()
	{}
	School(String sname)
	{
		this.sname=sname;
	}
	Stu s;
	public void Admission(String name,String place)
	{
		s=new Stu(name,place);
		System.out.println("student name:"+name);
		System.out.println("Student place:"+place);
		System.out.println("students school name:"+sname);
		System.out.println("admission completed");
		
	}
}
