package practice1;

public class Palidrome {

	public static void main(String[] args) {
		
		
		
	/*     String str = "w3schools";
		 
	   // int cnt = 0;
		 
	     char[] abc = str.toCharArray();
		
	     System.out.println("Duplicate Characters are:");
		
	     for (int i = 0; i < str.length(); i++) {
		 
	    	 for (int j = i + 1; j < str.length(); j++) {
		  
	    		 if (abc[i] == abc[j]) {
		    
	    			 System.out.println(abc[i]);
		    
	    			// cnt++;
	    			 j++;
	    			 
		   
	    			 break;
		    }
		   }
		  }
	*/	
		
		
		

      String s = "selenium";
      char [] abc = s.toCharArray();
  
      for (int i = 0; i<s.length(); i++)
      {
    	   for (int j = i+1 ; j <s.length(); j++)
    	   
    	   {
			if(abc[j]==abc[i])
			{
				System.out.println(abc[i]);
				j++;
			}
		}
		
	}
      
      
	}

}
