package stringConcepts;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ReverseString {

	public static void main(String[] args) {
		ReverseString o= new ReverseString();
		o.reverseString();
		o.reverseWords();
		o.reverseWordsAndString();
		o.reverseStringWithCharArray();
		o.reverseStringWithStringBuilder();
		o.reverseStringWithArrayList();

	}
	
	
	public void reverseString(){
		String sr = "StringToBeReversed";
		String rev="";
		
		for(int i=sr.length()-1;i>=0;i--){
			rev =rev+sr.charAt(i);			
		}
		
		System.out.println(rev);
	}
	
	public void reverseWords(){
		String sentance = "Sample program for string reversal";
		
		String words[]=sentance.split(" ");
		
		String revwords="";
		
		for(int i=words.length-1;i>=0;i--){
			
			revwords=revwords+ words[i] +" ";
		}
		
		System.out.println(revwords);		
		
	}
	
	public void reverseWordsAndString(){	
		
		String sentance = "Sample program for string reversal";
		
		String words[]=sentance.split(" ");
		
		String revString="";
		
		for(int i=words.length-1;i>=0;i--){
			String sr=words[i];
			String rev="";
			for(int j=sr.length()-1;j>=0;j--){
				rev =rev+sr.charAt(j);			
			}
			
			revString=revString+rev +" ";
		
		}
		System.out.println(revString);			
	}
	
	public void reverseStringWithCharArray(){
		
		String input = "String";
		char[] c = input.toCharArray();
		System.out.println("Reverse String with char Array");
		for(int i=c.length-1;i>=0;i--){
			System.out.print(c[i]);
		}
	}
	
	public void reverseStringWithStringBuilder(){
		
		String input  = "Selenium";
		StringBuilder SbInput = new StringBuilder("MuleSoft");
		//SbInput.append(input);
		
		StringBuilder Output = SbInput.reverse();
		
		System.out.print("\nUsing String Builder\t");
		System.out.print(Output);
		
	}
	
	public void reverseStringWithArrayList(){
		
		String input = "GeeksForGeeks";
		char[] charArray = input.toCharArray();
		ArrayList<Character> list = new ArrayList<Character>();
		for(char c:charArray){
			list.add(c);
		}
		
		Collections.reverse(list);
		System.out.println("\nUsing Array List");
		System.out.println(list);
		Iterator<Character> it = list.iterator();
		while(it.hasNext()){
			System.out.print(it.next());
			
		}
	}

}
