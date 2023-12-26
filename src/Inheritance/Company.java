package Inheritance;

 class Comp extends Emp
{
	 String cname;
	 String loc;
	 Comp(String name,int phno,String desg,String cname,String loc)
	 {
		 super( name, phno, desg);
		 this.cname=cname;
		 this.loc=loc;
	 }
	 void display1()
	 {
		 
		 System.out.println("comp name:"+cname);
		 System.out.println("comp loc:"+loc);
		 System.out.println("name:"+name);
		System.out.println("phno:"+phno);
		System.out.println("desg:"+desg);


}
}
