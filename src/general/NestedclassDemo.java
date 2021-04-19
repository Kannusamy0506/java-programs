package general;

 class Nestedclass {

	 String name = "Kannusamy";
	 
	public void display(){
		
		System.out.println("Inside outer class +++>");
	}
	
	public static class StaticInnerclass{
		
		public void add(){
			//The below stmt can't possible. Because the outer class variable is not static
			//System.out.println("addition inside static Inner class--->"+name);
			System.out.println("addition inside static Inner class--->");
		}
		
	}
	
	public class Innerclass{
		
		public void substract(){
			//The below stmt is valid. Because it can access outer class data members
			System.out.println("substraction inside normal Inner class--->"+name);
		}
	}
}



public class NestedclassDemo{
	
	public static void main(String args[]){
		
		//instantiate static inner class and call the method 
		Nestedclass.StaticInnerclass staticInner = new Nestedclass.StaticInnerclass();
		staticInner.add();
		
		
		//instantiate outerclass first and use the object create the instance of inner class
		//since its not a static class
		Nestedclass nestedclass = new Nestedclass();
		Nestedclass.Innerclass inner = nestedclass.new Innerclass();
		
		inner.substract();
		

	}
	
}