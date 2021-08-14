package assignment;

public class FindInterselection
{
	public static void main(String[] args)
	{
		int x[] = {1,2,11,4,9,7};
		int y[] = {1,2,8,4,9,7,3};
		System.out.println("intersection of two array");
		for(int i=0; i<x.length; i++)
		{
			for (int j = 0; j < y.length; j++) 
			{
				if (x[i]==y[j])
				{
					System.out.println(x[i]);
				}
			}
			
		}

	}
}