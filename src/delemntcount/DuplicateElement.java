package delemntcount;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateElement {

	public static void main(String[] args) {
		
		String s = "selenium";
		
		Map<String, Integer> mapdate = new HashMap<String, Integer>();
		for (int i = 0; i <s.length()-1; i++) 
		{
			String myarr = String.valueOf(s.charAt(i));
			
			String[] sarr = s.split(myarr);
			
			mapdate.put(myarr, sarr.length-1);
	
		}
		
		            Set<String> k = mapdate.keySet();
		            for (String key : k)
		            {
		            	
		            	if(mapdate.get(key)>1)
		            	{
						System.out.println(key+" character appear "+mapdate.get(key)+" time");  
		            	}
		            	
		            	
					}
	}

}
