package reverse;

public class ReverseInteger {

	public static void main(String[] args)
	{

       int number = 345678;
       int reverseNumber = 0;
       int temp = 0;
       
       while(number!= 0)
       {
       
       temp = number % 10; // % will show remainder, here remainder is 8;
       System.out.println(temp);

       reverseNumber = reverseNumber * 10 + temp;
       number = number/10;
	}
       
       System.out.println("Reverse Number is "+reverseNumber);
	}

}
