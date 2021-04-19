package general;

import java.util.Arrays;

public class CheckAnagram {

	public static void main(String args[]){
		
		boolean result = isAnagram("monkeyswrite ","New York Times");
		System.out.print(result);
	}
	
	public static boolean isAnagram(String s1,String s2){
		
   
		String cleanText1 = s1.replace(" ", "").toLowerCase();
		String cleanText2 = s2.replace(" ", "").toLowerCase();
		
		if(cleanText1.length()!=cleanText2.length()){
			return false;
		}
		
		 char[] text1 = cleanText1.toCharArray();
		 char[] text2 = cleanText2.toCharArray();
		 
		 Arrays.sort(text1);
		 Arrays.sort(text2);
		 
		 boolean value = Arrays.equals(text1, text2);
		return value;
	}
}
