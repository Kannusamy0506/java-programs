package general;

public class ThreadExample extends Thread {

	
	//If we directly call run method it will create a new thread, it will work on the callable thread
	public void run(){
		System.out.println("run method called --->");
	}
	
	
	public static void main (String args[]){
		
		//Implementing thread using Thread itself
		
		/*ThreadExample ex = new ThreadExample();
		ex.start();*/
		
		// Implementing thread using Runnable interface
		RunnableDemo demo = new RunnableDemo();
		Thread th = new Thread(demo);
		th.start();
		//th.start();    -- if we call start() method twice we get IllegalThreadStateException
		
	}
	
}


class RunnableDemo implements Runnable{

	@Override
	public void run() {
		System.out.println("Runnable run method called --->");
	}
	
}
