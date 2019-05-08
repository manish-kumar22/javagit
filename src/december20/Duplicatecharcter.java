package december20;

public class Duplicatecharcter {

	public static void main(String[] args) {

             String str = "schools";
              char [] ab = str.toCharArray();
             for (int i = 0; i<str.length(); i++)
             {

              for (int j = i+1; j <str.length(); j++)
              {
				if(ab[i]==ab[j])
				{
					System.out.println(ab[i]);
				}
			}
			}
            
	}

}
