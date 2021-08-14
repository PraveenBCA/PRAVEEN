package assignment;

import java.util.*;

public class MissingElement {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 8 };
		Arrays.sort(arr);
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] + 1 != arr[i + 1]) {
				System.out.println("Missing Element in row------>>>>>>: ");
				System.out.println(arr[i]+1);
				break;
			}
		}
	}

}
