package general;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

 class Student implements Comparable<Student> {

	int id;
	String name;
	int mark;
	
	public Student(int id, String name, int mark) {
 
		this.id = id;
		this.name = name;
		this.mark = mark;
	}

	@Override
	public int compareTo(Student st) {
		// TODO Auto-generated method stub
		/*if(this.getMark()>st.getMark()){
			return 1;
		}else{
			return -1;
		}*/
		
		//using ternary operator 
		return this.getMark()>st.getMark()?1:-1;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

}
public class ComparableDemo {

	public static void main (String args[]){

		
		List<Student> list = new ArrayList<>();
		list.add(new Student(3,"Raja",90));
		list.add(new Student(1,"Kannusamy", 100));
		list.add(new Student(2,"Kathirvel",85));
		
		//Comparable sorting
		  Collections.sort(list);
		
		//Comparator sorting
		/*Comparator<Student> com = new Comparator<Student> (){
			
			@Override
			public int compare(Student s1, Student s2) {

				if(s1.id > s2.id){
					return 1;
				}
				else{
					return -1;
				}
			
			}
		};*/
		
		//Collections.sort(list,com);
		  
		Collections.sort(list,( s1, s2) -> 
			{
				return s1.id>s2.id?1:-1;
			}
		);
		
		
	    for(Student st : list){
	    	System.out.println(st.id+""+st.name+""+st.mark);
	    }
		
	}
}
