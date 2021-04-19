package inheritance;

public class Car implements Shape{
	
	public void display(){		
		System.out.println("Display method from Car class");
	}
	
	public void speed(){		
		System.out.println("Speed method from Car class");
	}
	
	public void accelerate(){
		
		System.out.println("Accelerate from Car class");
	}

	public static void main(String[] args) {
		
		Shape v = new Car();
		
		v.display();
		
		

	}

}
