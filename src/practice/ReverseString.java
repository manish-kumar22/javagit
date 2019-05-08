package practice;

public class ReverseString {
	
	
	
	
	public static void main(String[] args) {
		String s = "madam";
		 String srt = "";
		  int b = (s.length());
		
		
	for (int i=b-1; i>=0; i--) 
	{ 
		
		System.out.println(s.charAt(i));
		
				srt = srt + s.charAt(i);
	}
				
				System.out.println(srt);
						
			if(srt==s)
	     {
		System.out.println("String is paladrome");
	    }
	     else
	     {
	    	 System.out.println("String is not paladrome");
	     }

	}

}
