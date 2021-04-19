package java8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class JavaIterations {

	public static void main (String args[]){
		
		List<Integer> values = Arrays.asList(1,2,3,4,5);
		
		//normal for loop  (we can use when we need to print from particular values. Ex: 2 to 5)
		/*for(int i=0; i<5; i++){
			System.out.println(values.get(i));
		}*/
		
		
		//enhanced for loop   (we can use when we need to print all the values) 
		/*for(int i : values){
			System.out.println(i);
		}*/
		
		
		//Iterator     (we can use when need to print and update the values)
	    Iterator<Integer> iter = values.iterator();
	    while(iter.hasNext()){
	    	System.out.println(iter.next());
	    }
		
		
	}
}
