package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintEven {

	public static void main (String args[]){
		
	
	//List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	
	//list.stream().filter(ls->ls%2==0).forEach(System.out::println);

	
		Integer[] arr = new Integer[]{1,2,3,4,5};
		
		List<Integer> list = Arrays.stream(arr).filter(ls->ls%2==0).collect(Collectors.toList());
		System.out.println(list);
		
		//distinct() and sorted(),limit(),skip() -- intermediate operations
		//toArray() - terminal operations
		Integer[] arr1 = new Integer[]{1,4,3,6,2,4,6};
		Object[] result = Arrays.stream(arr1).distinct().sorted().limit(4).skip(1).toArray();
		System.out.print(Arrays.toString(result));
	}
	
}