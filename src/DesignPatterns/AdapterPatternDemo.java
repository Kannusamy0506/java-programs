package DesignPatterns;

public class AdapterPatternDemo {

	public static void main (String args[]){
		Sparrow s = new Sparrow();
		ToyDuck d = new PlasticToyDuck();
		
		s.fly();
		s.makeSound();
		d.squeak();
		
		ToyDuck bd = new BirdAdapter(s);
		bd.squeak();
	}

}


interface Bird
{
	public void fly();
	public void makeSound();
}


class Sparrow implements Bird{
	public void fly(){
		System.out.println("Sparrow is flying----->");
	}
	
	public void makeSound(){
		System.out.println("Chirp Chirp....");
	}
}


interface ToyDuck{
	public void squeak();
}


class PlasticToyDuck implements ToyDuck{
	
	public void squeak(){
		System.out.println("Squeak------>");
	}
}




class BirdAdapter implements ToyDuck{
	
	Bird bird;
	
	BirdAdapter (Bird bird){
		this.bird = bird;
	}
	public void squeak(){
		bird.makeSound();
	}
}





