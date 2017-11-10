package webservice;

public class Fib 
{
	public static long fib(int number)
	{
		if(number<=0)
			return 0;
		
		if(number==1)
			return 1;
		
		return fib(number-1)+fib(number-2);	
	}
	
	public static long fib_2(int number)
	{
		int a=0;
		int b=1;
		for(int i=0;i<number;i++)
		{
			int temp=a+b;
			a=b;
			b=temp;
		}
		return b;
	}

}
