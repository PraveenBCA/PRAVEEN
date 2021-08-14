package assignment;

public class ReserveEvenWords {
	public static void main(String args[])
	{
		String str = "good to see your all";
		
		String[] split = str.split(" ");
		
		for(int i = 0; i < split.length; i++)
		{
			if(i%2 != 0){ 
				split[i] = new StringBuffer(split[i]).reverse().toString(); 
			} 
		}
		
		StringBuffer output = new StringBuffer(); 
		for(String x : split)
		{ 
			output.append(x+" "); 
		} 
		System.out.println(output);
	}
}