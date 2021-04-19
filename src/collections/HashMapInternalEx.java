package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapInternalEx {

	public static void main(String args[]){
		
		Map<String,Integer> map = new HashMap<>();
		map.put("kannu", 1);
		map.put("raja",2);
		map.put(null,3);
		//map.put(null,4);
		map.put("muthu",4);
		map.put("kumar",5);
		map.put("ashok",6);
		map.put("pavi",7);
		map.put("raju",8);
		map.put("suneel",9);
		map.put("naren",9);
		map.put("siva",9);
		map.put("vedha",9);
		
		//hash collision
		/*map.put("FB", 1);
		map.put("Ea", 2);*/
		
	}
}
