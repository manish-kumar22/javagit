package dec24;

public class Duplicate_char_in_sentence {

	public static void main(String[] args) {

        String str = "selenium is open source Tool";
           
        char [] Arrstr = str.toCharArray();
           // int count = 0;
            
            for (int i = 0; i < Arrstr.length; i++) 
            	
            {
            	//  int count = 0;
				char c = Arrstr[i];
				  int count = 0;   // sir  
            
           for (int j = 0; j < Arrstr.length; j++) 
           {
			 if(Arrstr[j]==c)
			 {
				count++;
			 }
			  
		}
           System.out.println("Duplicate charctaer is " + c +" count is: " + count);
           System.out.println("   ");
           
	}

}
}
