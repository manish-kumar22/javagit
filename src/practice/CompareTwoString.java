package practice;

public class CompareTwoString {

	public static void main(String[] args) {

     String Str = "AVATAR";
     String str1= "avatar";
     
     if(str1.equals(Str))
    		 {
    	  System.out.println("Both string are equal");
    		 }
     else
     {
    	 System.out.println("Both string are not equal");
     }
     if(str1.equalsIgnoreCase(Str))
     {
    	 System.out.println("Both are equal");
     }
     else {
		System.out.println("Both are not equal");
	}
	}

}

