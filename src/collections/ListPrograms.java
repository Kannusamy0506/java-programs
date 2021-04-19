package collections;

import java.util.ArrayList;
import java.util.List;

public class ListPrograms {

	public static void checkList(){
		List<String> A= new ArrayList<String>();
		
		A.add("a");
		A.add("b");
		A.add("c");
		A.add("b");
		A.add("a");
		
		System.out.println(A);
		
		
		List<String> B= new ArrayList<String>();
		
		B.add("a");
		B.add("b");
		
		System.out.println(B);
		
		A.retainAll(B);
		
		System.out.println(A);
	}

	public static void main(String[] args) {
		checkList();
		
		
	}

}
