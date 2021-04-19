package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class JavaIterationByLambdaExp {

	public static void main(String args[]){
		List<Integer> values = Arrays.asList(1,2,3,4,5);
		
		//Internal loop operations in java
		
		/*Consumer<Integer> c = new Consumer<Integer>()  //defined in a Anonymous inner class
		{

			public void accept(Integer i) {
			  System.out.println(i);	
			}
			
		};
		values.forEach(c);*/
		
		/*Consumer<Integer> c = (Integer i) -> System.out.println(i); // removed the anonymous inner class
		values.forEach(c);*/
		
		/*Consumer<Integer> c = i -> System.out.println(i); // removed the Integer
		values.forEach(c);*/
		
		values.forEach(i->System.out.println(i)); // added inside foreach
	}
}
