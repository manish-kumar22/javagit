package practice;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int a ;
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter number a ");
		a = obj.nextInt();
		

		  for (int i = 1; i<=a; i++)
		  {
		   if(i % 2==0)
		   {
			   break;
		   }
		   else
		   {
			   System.out.println(i);
		   }
		   
		   
		 }
		

	}
}


