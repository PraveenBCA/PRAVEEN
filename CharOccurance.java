package assignment;

public class CharOccurance {
	public static void main(String[] args) {
		
		String str= "Welcome to Chennai";
		int count=0;
		char[] ch1=str.toCharArray(); 
		int len=ch1.length;
		for(int i=0;i<len;i++)
		{
			count=1;
			for(int j=i+1;j<len;j++)
			{
				if(ch1[i]==ch1[j])
				{
					count++;
					ch1[j]='0';
				}
			}
			if(ch1[i]!='0')
			{
				System.out.println(ch1[i] +":" +count);
			}
		}
		
	

	}
}
