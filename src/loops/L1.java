package loops;

public class L1 {
public static void main(String[] args) {
	int i=2;
	int count = 0;
	int sum=0;
	for(int a=0;a<=50;a++)
	{
		if(a%i==0)
		{
			System.out.println(a);
			sum=sum+a;
			count++;
		}
       
	}
	System.out.println("the total num:"+count);
	System.out.println("the sum of num is "+sum);
	int []b=new int[count];
	int temp=0;
	for(int a=0;a<=50;a++)
	{
	
		if(a%i==0)
		{
		 for(int t=0;t<26;t++)
		 {
			 b[t]=a;
		 }
		
     	}
	}
	for(int c=0;c<b.length;c++)
	{
	System.out.println(b[c]);	
	}

}
}
