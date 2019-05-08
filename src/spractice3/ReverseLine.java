package spractice3;

public class ReverseLine {

	public static void main(String[] args) {

       String s = "My name is manish";
       String[] split = s.split(" "); // Add Line
       String rev = "";
       for (int i=split.length-1; i>=0; i--)
       {
		// rev = rev + split[i];
		 rev += (split[i] + " ");  // Add line
	  }
       System.out.println(rev.trim());
	}

}
