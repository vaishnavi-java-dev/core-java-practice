package revison2;
interface Employeee{
	
	void work();
}

class Developer implements Employeee{
	
	public void work() {
		System.out.println("Developer writes code ");
	}
}
class Tester implements Employeee{
	
	public void work() {
		System.out.println("Terster tests code ");
	}
}
class Manager implements Employeee{
	
	public void work() {
		System.out.println("Mangaer manages");
	}
}

public class InterfaceArray {

	public static void main(String[] args) {
		Employeee arr[] = new Employeee[3];
		
		arr[0] = new Developer();
		arr[1]= new Tester();
		arr[2]= new Manager();
		
		for(int i=0; i<arr.length;i++) {
			
			arr[i].work();
		}

	}

}
