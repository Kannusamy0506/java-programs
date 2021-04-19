package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;


public class ConcurrentModification {

	public static void main (String args[]){

		//To throw the ConcurrentModificationException during the modification of map in iteration
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "aaaa");
		map.put(2, "bbbb");
		map.put(3, "cccc");
		map.put(4, "dddd");
		
		System.out.println("Before Iteration ==>"+map);
		
		Set<Integer> s = map.keySet();
		Iterator<Integer> iter = s.iterator();
	    while(iter.hasNext()){
			Integer key =  iter.next();
			if(key.equals(3)) map.put(5, "dddd");
		}
		
	    System.out.println("After Iteration ==>"+map);
	    
	    
	    
	    //Use ConcurrentHashMap to avoid the exception
		
		/*Map<Integer,String> map = new ConcurrentHashMap<>();
		map.put(1, "aaaa");
		map.put(2, "bbbb");
		map.put(3, "cccc");
		map.put(4, "dddd");
		
		System.out.println("Before Iteration ==>"+map);
		
		Set<Integer> s = map.keySet();
		Iterator<Integer> iter = s.iterator();
	    while(iter.hasNext()){
			Integer key =  iter.next();
			if(key.equals(3)) map.put(5, "eeee");
		}
		
	    System.out.println("After Iteration ==>"+map);*/
		
	}
}
