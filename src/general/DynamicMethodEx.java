package general;



public class DynamicMethodEx extends DynamicMethodDispatchDemo {

	public void display(){
		System.out.println("Sub Demo");
	}
	
	public void output(){
		System.out.println("output");
	}
	
	
	public static void main (String args[]){
		
		DynamicMethodDispatchDemo demo = new DynamicMethodEx();
		DynamicMethodEx ex = new DynamicMethodEx();
		DynamicMethodDispatchDemo base = new DynamicMethodDispatchDemo();
		
		demo.display();
		//demo.output(); // not allowed to call child class method
		demo.get();
		
		ex.display();
		ex.output();
		ex.get();
		
		base.display();
		base.get();
	}
}