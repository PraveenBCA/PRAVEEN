package assignment;

public class Palindrome
{
	public static void main(String args[]) 
	{
		String str = "malayalam";

		String rev = "";

		int lenght = str.length();

		for (int i = lenght - 1; i >= 0; i--)
		{
			rev = rev + str.charAt(i);

		}
		if (str.equals(rev)) 
		{
			System.out.println("The string is a Palindrome");
		} 
		else 
		{
			System.out.println("The string not is a Palindrome");
		}
	}

}
