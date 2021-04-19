package general;

import java.util.Arrays;
import java.util.List;

public class CheckEven {

	public static void main (String args[]){
		
		List<Integer> values = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		for(int i : values){
			
			if(i%2==0){
				System.out.println(i);
			}
		}
	}
	
	void  method(int a){
		a = 4;
	}
}
