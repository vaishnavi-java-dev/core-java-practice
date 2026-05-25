package revison2;

abstract class Shape{
	
	abstract void draw();
}

class Circle extends Shape{
	
	public void draw() {
		
		System.out.println(" Shape is Circle");
	}
}
class Rectangel extends Shape{
	
	public void draw() {
		System.out.println(" Shape is Rectangel");
	}
}
public class Abstraction {

	public static void main(String[] args) {
		
		Shape  s1 =  new Circle();
		s1.draw();
		
		Shape s2 = new Rectangel();
		s2.draw();

	}

}
