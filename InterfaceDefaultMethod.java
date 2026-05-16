package revison2;

interface Method {
	default void showiing() {
		System.out.println("Default Method");
	}
}

class Test implements Method {
	
}

public class InterfaceDefaultMethod {

	public static void main(String[] args) {
		Method d= new Test();
		d.showiing();

	}

}
