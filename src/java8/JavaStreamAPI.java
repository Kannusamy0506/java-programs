package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;

public class JavaStreamAPI {

	public static void main(String args[]){
		
		List<Integer> values = new ArrayList<>();
		for(int i =0; i<100; i++){
			values.add(i);
		}
		
		/*values.stream().filter(i -> {
			System.out.println("Hi");
			return true;
		}).findFirst().orElse(0);*/
		
		System.out.println(values.stream().filter(l -> l > 5).findFirst());
		
}
}
