
package DesignPatterns;


interface Shape{
	
	public void draw();
}


class Rectangle implements Shape{
	
	public void draw(){
		System.out.println("Rectangle - draw() ");
	}
}

class Square implements Shape{
	
	public void draw(){
		System.out.println("Square - draw() ");
	}
}

class Circle implements Shape{
	
	public void draw(){
		System.out.println("Circle - draw() ");
	}
}


class ShapeFactory{
	
	/*Shape s;
	
	ShapeFactory (Shape s){
		this.s = s;

	}*/
	
	public Shape getShape(String type){
		
		Shape s;
	
		if (type == null){
			return null;
		}
		
		else if (type.equalsIgnoreCase("Circle")){
			s = new Circle();
			return s;
		}
		
		else if (type.equalsIgnoreCase("Rectangle")){
			s = new Rectangle();
			return s;
		}
		
		else if (type.equalsIgnoreCase("Square")){
			s = new Square();
			return s;
		}
		
		return null;
	}
}


public class FactoryPatternDemo {

	public static void main(String args[]){
		/*ShapeFactory factory1 = new ShapeFactory(new Rectangle());
		factory1.s.draw();
		
		ShapeFactory factory2 = new ShapeFactory(new Circle());
		factory2.s.draw();
		
		ShapeFactory factory3 = new ShapeFactory(new Square());
		factory3.s.draw();*/
		
		ShapeFactory factory = new ShapeFactory();
		

		Shape circle = factory.getShape("Circle");
		circle.draw();
		
		Shape rect = factory.getShape("Rectangle");
		rect.draw();
		
		Shape square = factory.getShape("Square");
		square.draw();
	}
}
