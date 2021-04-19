package general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagramCount {

	public static void main(String args[]){
		
		List<String> list1= Arrays.asList("tea", "newyorktimes", "ball");
		List<String> list2= Arrays.asList("ate","monkeyswrote","pen");
		
		List<Integer> countList = getMinimumDifference(list1,list2);
		System.out.print(countList);
	}
	
	public static List<Integer> getMinimumDifference(List<String> a, List<String> b) {
	    // Write your code here
	        List<Integer> result = new ArrayList<>();
	        for(int i=0;i<a.size();i++){
	            result.add(countDifference(a.get(i),b.get(i)));
	        }
	    
	        return result;
	    }
	    public static int countDifference(String s1 , String s2){
	        if(s1.length()!=s2.length()){
	            return -1;
	        }
	    int count = 0; 
	  
	        // store the count of character 
	        int char_count[] = new int[26]; 
	  
	        // iterate though the first String and update  
	        // count 
	        for (int i = 0; i < s1.length(); i++)  
	            char_count[s1.charAt(i) - 'a']++;         
	  
	        // iterate through the second string 
	        // update char_count. 
	        // if character is not found in char_count 
	        // then increase count 
	        for (int i = 0; i < s2.length(); i++)  
	            if (char_count[s2.charAt(i) - 'a']-- <= 0) 
	                count++; 
	          
	        return count; 
	    }
}
