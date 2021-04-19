package java8;

import java.util.Arrays;
import java.util.List;

public class JavaStreamAPILazyMethodPerformace {

	public static void main(String args[]){
		
		List<Integer> values = Arrays.asList(12,20,35,46,55,68,75);

		//External operation
		/*int result = 0;
		for(int i : values){
			if(i%5==0){
				result=i*2;
				break;
			}
		}
		System.out.println(result);*/
		
		//Internal operaion
		//System.out.println(values.stream().filter(i -> i%5==0).map(i->i*2).findFirst().orElse(0)); //If findFirst() give empty print orElse value
		
		//To prove lazy evaluation is better than enhanced for loop. since the methods(filter,map) will not work on all the stream values.
		System.out.println(values.stream().filter(JavaStreamAPILazyMethodPerformace::isDivisible)
				.map(JavaStreamAPILazyMethodPerformace::isMultiple)
				.findFirst()
				.orElse(0)); //If findFirst() give empty print orElse value

	}
	
	public static boolean isDivisible(Integer i){
		System.out.println("isDivisible"+i);
		return i%5==0;
	}
	
	public static int isMultiple(Integer i){
		System.out.println("isMultiple"+i);
		return i*2;
	}
}
