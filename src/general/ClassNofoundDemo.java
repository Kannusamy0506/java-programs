package general;

public class ClassNofoundDemo {

	public static void main (String args[]) {
		
		try{
		Class.forName("Demo");
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
