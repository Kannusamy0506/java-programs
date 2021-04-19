package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class JavaStreamAPIFilter {

	public static void main(String args[]){
		
		List<Integer> values = Arrays.asList(12,20,35,46,55,68,75);
		
		//External operation
		/*int result=0;
	   for(int i : values){
		   if(i%5==0){
			   result+=i;
		   }
	   }
		
	   System.out.println(result);*/
		
		//Internal operation
		
		/*Predicate<Integer> p = new Predicate<Integer>(){ //Fuctional Interface 
			public boolean test(Integer i){
				return i%5==0;
			}
		};
		
		System.out.println(values.stream().filter(p).reduce(0,(c,e)->c+e));*/
		System.out.println(values.stream().filter(i -> i%5==0).reduce(0,Integer::sum));
		
		System.out.println(values.stream().filter(i -> i%5==0).map(i->i*2).findFirst()); //multipled by map and used findFirst()
		
		System.out.println(values.stream().filter(i -> i%5==0).map(i->i*2).findFirst().orElse(0)); //If findFirst() give empty print orElse value

	}
}
