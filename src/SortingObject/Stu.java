package SortingObject;

public class Stu implements Comparable {
	String name;
	int Sid;
	Stu(){}
	Stu(String name,int Sid){
		this.name=name;
		this.Sid=Sid;
	}
    public String toString()
    {
	return "name:"+name+"   id:"+Sid;
    }
    public int compareTo(Object o)
    {
    	Stu s1=(Stu)o;
    	return this.name.compareTo(s1.name);
    }
}
