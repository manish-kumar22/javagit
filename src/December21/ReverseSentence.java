package December21;

public class ReverseSentence {

	public static void main(String[] args) {
		
		String str = "Selenium is open source tool,it is used for aurtomation";
		   String [] Arrstr =    str.split(" ");
		   String Rev = "";
		   
		   for (int i = Arrstr.length-1; i>=0; i--)
		   {
			   
			   Rev = (Rev + (Arrstr[i]+" "));
			
		}
		   System.out.println(Rev);
		
	}

}
