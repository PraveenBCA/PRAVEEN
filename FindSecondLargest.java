package assignment;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindSecondLargest
{
	public static void main(String[] args) 
	{

		int data[] = { 65,85,45,99,1000,010000 };
		int size = Array.getLength(data);
		Arrays.sort(data);
		int secLar = data[size - 2];
		System.out.println("2nd largest element is " + secLar);

	}

}
