package assignment;
import java.util.Arrays;
public class Anagram {
	public static void main(String args[])
	{
		String word1 = "heart";
		String word2 = "earth";
		
		if(word1.length() != word2.length())
		{
			System.out.println("the length of the strings are not equal");

		}
		else
		{
			char[] string1 = word1.toCharArray();
			char[] string2 = word2.toCharArray();
		
		Arrays.sort(string1);
		Arrays.sort(string2);
		
		if(Arrays.equals(string1, string2) == true) {
			System.out.println("Both strings are Anagram");
		}
		else {
			System.out.println("Both strings are not Anagram");
		}
		
		}
	}
}
