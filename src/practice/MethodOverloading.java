package practice;

public class MethodOverloading {

	//int a, b;
	public  void add(int a,  int b)
	{
		
		
		System.out.println("Add value with two parameters "+(a+b));
		
	}
	public static void add(int a,  int b, int c)
	{
		
		
		System.out.println("Add value with three parameters "+(a+b+c));
		
	}
	
	public static void Mull(int a,  int b, int c)
	{
		
	
		System.out.println("Mull value with three parameters "+(a*b*c));
		
	}
	
	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		obj.add(1, 5);
		obj.add(4, 7, 9);
	 

	}

}
