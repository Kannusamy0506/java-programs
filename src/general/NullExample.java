package general;

 class NullExample {
	 
	    NullEmployee emp;

		public void display(String value){
			System.out.println("value is =="+value);
		}

		
		public void display(NullEmployee obj){
		  System.out.println("Object is =="+obj);	
		}
		
		
		public static void main (String args[]){
			
			NullExample ex = new NullExample();
			
			NullEmployee arg = null;
			ex.display(arg);
			
			//ex.display(null);
		}
	}


 class NullEmployee{
	 
	 int id ;
	 String name;
 }