package revison2;

abstract class	Animal{
	
	abstract void sound();
	public void eating() {
		
		System.out.println("Animal is eating");
	}
}

interface Pet{
	void play();
}

class Lion extends Animal implements Pet{
	
	void sound() {
		System.out.println("Lion sounds");
	}
	
	public void play() {
		System.out.println("Lion is playing");
	}
	
}
public class AbstractInterface {

	public static void main(String[] args) {
		Lion n = new Lion();
		
		n.eating();
		n.sound();
		n.play();

	}

}
