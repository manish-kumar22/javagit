package december20;

public class ReverseNumber {

	public static void main(String[] args) {
		int a = 12345;
		int b = 0, c=0;
		//int a = 0;
		while(a!=0)
		{   
			b= a%10;
			
			System.out.println(b);
			
			c = c*10 + b;
			
			System.out.println(c);
			//System.out.println(a);
			//b = b+a;
			//System.out.println(b);
			a = a/10;
		}
		
	    System.out.println(c);
	}

}
