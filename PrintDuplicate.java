package assignment;

public class PrintDuplicate
{
	public static void main(String[] args) 
	{
		int a[] = { 45,55,65,65,95,85,75,85,75,55 };
		int arrayLength = a.length;
		System.out.println("Length of Array: " + arrayLength);

		for (int count = 0; count < a.length; count++) 
		{
			for (int i = count + 1; i < a.length; i++)
			{
				if (a[count] == a[i]) 
				{
					System.out.println(a[count]);
				}
			}

		}
	}

}
