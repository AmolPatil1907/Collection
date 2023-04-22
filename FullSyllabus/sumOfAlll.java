package FullSyllabus;

public class sumOfAlll {


public class MyClass
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int n1 = 25;
		int n2 = 1548;
		myCode(n1,n2);
	}
	//EndOfMainMethod
	public static void myCode(int n1,int n2) 
	{
		int sum = 0;
		while(n1>0)
		{
			int p1 = 0;
			int rem1 = n1%10;
			int rem2 = n2%10;
			p1 = rem1*rem2;
			sum = sum + p1;
			n1/=10;
			n2/=10;
		}
		System.out.print(sum);
	}



}


    
}
