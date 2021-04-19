package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaExpressionExample {

	public static void main(String args[]){
		
		//***** Print list by lambda expression *****//
		
		//List<String> intList = Arrays.asList("Kannusamy","Pavithra","Sakthivel","Palaniyammal");
		//intList.forEach(i->System.out.println(i));
		//intList.forEach(System.out::println);
		
		
		//***** Print array by lambda expression *****//
		
		String arr[] = {"Kannusamy","Pavithra","Sakthivel","Palaniyammal"};
		Arrays.stream(arr).forEach(i->System.out.println(i));
		//Arrays.stream(arr).forEach(System.out::println);
	}
}
