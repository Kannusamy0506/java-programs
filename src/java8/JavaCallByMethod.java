package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaCallByMethod {

	public static void main(String args[]){
		List<Integer> values = Arrays.asList(1,2,3,4,5,6);
		
		//Print the values by CallByMethod. without lambda expression or functional interface we can do like this
		//we can pass a method as a reference to the method which is inside a interface
		values.forEach(System.out::println);
		values.forEach(JavaCallByMethod::doubletheValues);
		
		List<String> gamesList = new ArrayList<String>();
		gamesList.add("Cricket");
		gamesList.add("Football");
		gamesList.add("Hockey");
		gamesList.add("VolleyBall");
		
		gamesList.forEach(games -> System.out.println(games));
		gamesList.forEach(System.out::println);
		
	}
	
	public static void doubletheValues(Integer i){
		System.out.println(i*2);
	}
}
