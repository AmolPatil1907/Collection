
public class MyClass 
{
	public static void main(String[] args)
	{
		//CS.16
		int i = 20;  
		myCode(i);
	}
	private static void myCode(int i) 
	{
		System.out.print('a');
		outer : while (3 < 4) 
		{
			System.out.print('b');
			do 
			{
				System.out.print('c');
				if (i++ > 20)
				break outer;
				if (1 < 2)
				break;
				System.out.print('d');
			}
			while (6 > 7);
			System.out.print('e');
		}
		System.out.print('f');
	}
}


