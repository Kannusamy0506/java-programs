package collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;
import java.util.Set;

public class HashMapIteration {

	public static void main (String args[]){
			
		Map<String,Integer> emp = new HashMap<String, Integer>();
		emp.put("Kannusamy", 1);
		emp.put("Rajesh", 2);
		emp.put("Manivel", 3);
		emp.put("Muthu", 4);
		emp.put("Kani", 5);
		emp.put("Mani", null);
		
		//Iteration through keySet()
		/*Set<String> keys = emp.keySet();
		for(String key : keys){
			System.out.println("values==>"+ emp.get(key));
		}*/
		
		
		//Iteration through entrySet()
		Set<Map.Entry<String, Integer>> entry = emp.entrySet();
		for( Map.Entry<String, Integer> m : entry){
			System.out.println("key="+m.getKey()+" value="+m.getValue());
		}
	}
}
