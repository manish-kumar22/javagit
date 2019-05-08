package december20;

public class ReverseNumber1 {

	public static void main(String[] args) {

           int a = 123456789;
           int b = 0;
           int c= 0;
           
           while(a!=0)
           {
        	   b = a%10;
        	   System.out.println(b);
        	   
        	   c = c*10 +b;
        	   System.out.println(c);
        	   
        	   a = a/10;
        	   
        	   
           }
           System.out.println(c);

	}

}
