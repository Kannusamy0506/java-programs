package general;

public class EqualDemo {
	
	public static void main(String args[]){

	String s1= new String("Kannusamy");
	String s2= new String("Kannusamy");
	
   System.out.println(s1 == s2);  // checks the reference (memory location of the object)
   System.out.println(s1.equals(s2)); //checks the value of the object

   String p1 = "Pavithra";
   String p2 = "Pavithra";
   
   System.out.println(p1 == p2);
   System.out.println(p1.equals(p2));
   
   
	}
}


