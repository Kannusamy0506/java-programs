package DesignPatterns;


/*//Lazy Singleton - Here multiple objects can be created through multiple threads
public class Singleton {

	private static Singleton obj ;
	
	private Singleton(){}
	
	public static Singleton getInstance (){
		if (obj == null)
			obj = new Singleton();
		return obj;
	}
	
}




//Singleton - using synchronized - It allows one thread, but its take time since for every time it allows one thread to access 


public class Singleton Singleton {
	
	private static Singleton obj;
	
	private Singleton(){}
	
	public static synchronized getInstance(){
		if (obj == null)
		obj = new Singleton();
		return obj;
}
}



//Eager initialization - since obj initialized through static initializer ,  jvm creates the object at the time of class loading

public class Singleton{
	
	private static Singleton obj = new Singleton();
	
	public static Singleton getInstance(){
		return obj;
	}
	
}*/


//Double locking - to avoid  synchronization on method every time. It will make synchronize first time.

class Singleton{
	
	private static volatile Singleton obj ;
	
	public static Singleton getInstance(){
		if (obj == null){
		   synchronized (Singleton.class) 
		   {
		   if (obj == null ){
			   obj = new Singleton();
			   
		   }
		}
	}
	return obj;
	}
	
	public void display(){
		System.out.println("My Singleton Demo --->");
	}
}





public class SingletonTypes {

	public static void main(String args[]){
		
		Singleton s = Singleton.getInstance();
		s.display();
	}

}
