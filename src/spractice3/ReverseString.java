package spractice3;

public class ReverseString {

	public static void main(String[] args) 
	{
		String str = "Radam";
		String bcd = "";
		//int s = str.length();
		//System.out.println(s);
		//System.out.println(str.charAt(3));
		for (int i = str.length()-1; i>=0; i--)
			
		{
		 	//System.out.println(str.charAt(i));
		 	 bcd = bcd + str.charAt(i);
		}
		System.out.println(bcd);
		
	//	if(bcd.equals(str))
	//	{
	//		System.out.println("Given string is palandrome");
	//	}
	//	else
	//	{
		//	System.out.println("Given string is not paladrome");
		//}
	}

}
