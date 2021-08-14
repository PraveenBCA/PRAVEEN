package assignment;

public class FindType {
	public static void main(String[] args) {
		String a = "1.good Morning frds."
				+ "2.good nit guys.";

		int  letter = 0, space = 0, num = 0, specialChar = 0;
		
		for(int i = 0; i < a.length(); i++)
		{
			char ch=a.charAt(i);
			
			if(ch >= 'A' && ch<='Z' || ch>='a' && ch<='z') {
				letter++;
			}
			
			else if(ch>='0' && ch<='9'){
				num++;
			}
			
			else if(ch ==' '){
				space++;
			}
			
			else{
				specialChar++;
			}
		}
		System.out.println("Alphabet letters: "+letter);
		System.out.println("Number: "+num);
		System.out.println("Space: "+space);
		System.out.println("Special characters: "+specialChar);

		}
		
}
