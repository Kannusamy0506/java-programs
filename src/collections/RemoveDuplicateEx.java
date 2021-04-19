package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class RemoveDuplicateEx {

	public static void main (String args[]){
		
		List<Integer> studlist=new ArrayList<Integer>();
		studlist.add(101);
		studlist.add(102);
		studlist.add(105);
		studlist.add(104);
		studlist.add(102);
		
		
		Set<Integer> studSet = new HashSet<Integer>(studlist);
		//studlist.clear();
		//studlist.addAll(studSet);
		
		List<Integer> convertedList = new ArrayList<Integer>(studSet);
		
		for(Object obj : convertedList){
			System.out.println(obj);
		}
		
	}
}
