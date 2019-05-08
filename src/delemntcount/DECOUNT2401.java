package delemntcount;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DECOUNT2401 {

	public static void main(String[] args) {

               String s = "ABBACABDE";
               Map<String, Integer> mapdata = new  HashMap<String, Integer>();
               
               for (int i = 0; i <s.length(); i++)
               {
				String mychar = String.valueOf(s.charAt(i));
				
				String[] sarr = s.split(mychar);
				
				mapdata.put(mychar, sarr.length-1);
			 }
               
               Set<String> key = mapdata.keySet();
               
               for (String k : key)
               {
				 if(mapdata.get(k)==1)
				 {
					 System.out.println(k+ " character is appear "+mapdata.get(k));
					 break;
				 }
			}
	}

}
