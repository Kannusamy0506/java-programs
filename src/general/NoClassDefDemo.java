package general;

 class NoClassDefDemo {

	public static void main (String args[]){
		
		DefDemo d = new DefDemo();
		d.display();
	}
	
}


class DefDemo{
	
	 void display(){
		System.out.println("Display()");
	}
}



//It will compile succesfully. It will give ouptut.
//But if we delete a NoClassDefDemo .class file and then run DefDemo. 
//It will give NoClassDefFoundError