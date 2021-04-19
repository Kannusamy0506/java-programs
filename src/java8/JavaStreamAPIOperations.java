package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class JavaStreamAPIOperations {

	public static void main(String args[]){
		
		List<Integer> values = Arrays.asList(1,2,3,4,5,6);
		
		//double the values using enhanced for loop
				/*int result = 0;
				for(int i : values){
					result = result+i*2;
				}
				System.out.println(result);*/
		 
		
		//explanation for the final SOP		
		/*BinaryOperator<Integer> b = new BinaryOperator<Integer>(){  //functional interface to get the stream values to one final values using reduce
			@Override
			public Integer apply(Integer i, Integer j) {
				return i+j;
			}
			
		};
		
        Function<Integer,Integer> f = new Function<Integer,Integer>(){ //functional interface
			public Integer apply(Integer i){
				return i*2;
			}
			};
				
		    Stream<Integer> s = values.stream();		
		
			Stream<Integer> s1 = s.map(f);
					
			Integer result = s1.reduce(0,b);
			
			System.out.println(result);*/
		
		
		System.out.println(values.stream().map(i -> i*2).reduce(0, (c,e)->c+e));
        System.out.println(values.stream().map(i -> i*2).reduce(0,(c,e)-> Integer.sum(c, e)));  //Integer class sum method used
        System.out.println(values.stream().map(i->i*2).reduce(0,Integer::sum)); //Call by method
			
	}
	
	
}
