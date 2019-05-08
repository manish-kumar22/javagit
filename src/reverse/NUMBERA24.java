package reverse;

public class NUMBERA24 {

	public static void main(String[] args) {

       int Num = 234567;
       int temp =0;
      int revnum = 0;
       
       while(Num!=0)
       {
       
       temp =  Num%10; // here remainder is 7
       revnum = revnum*10 + temp;
       Num = Num/10;
       
       }
       System.out.println(revnum);

	}

}
  