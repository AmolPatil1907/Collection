public class CheckDoorIsOpen {
  /* 
ProblemStatement
Given n doors and n persons. The doors are numbered 1 to n and persons are given id’s numbered 1 to n. Each door can have only 2 status open and closed. Initially all the doors have status closed. Find the final status of all the doors if a person changes the current status of all the doors, i.e. if status open then change to status closed and vice versa, for which he is authorized. A person with id ‘i’ is authorized to change the status of door numbered ‘j’ if ‘j’ is a multiple of ‘i’. 
Note: 
– A person has to change the current status of all the doors for which he is authorized exactly once. 
– There can be a situation that before a person changes the status of the door, another person who is also authorized for the same door changes the status of the door. 
Example : 
 

Input : 3
Output : open closed closed
Explanation : As n = 3, therefore there are 
3 doors {1, 2, 3} and 
3 persons with ids {1, 2, 3}
person with id = 1 can change the status of door 1, 2, 3 
person with id = 2 can change the status of door 2 
person with id = 3 can change the status of door 3
Current status of all doors: closed closed closed 
*/


	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int n = 3;
		myCode(n);
	}
	//EndOfMainMethod
	public static void myCode(int n) 
	{
		int [] arr = new int [n];
		//               person
		for(int i=0; i<n; i++)
		{
			//door
			for(int j=0; j<n; j++)
			{
				if((j+1)%(i+1) == 0)
				{
					change(arr,j);
				}
			}
		}
		for(int dat:arr)
		{
			if(dat==0)
			System.out.print("closed ");
			else
			System.out.print("open ");
		}
	}
	public static void change(int[] a,int j)
	{
		if(a[j]==0)
		a[j]=1;
		else
		a[j]=0;
	}
}    

