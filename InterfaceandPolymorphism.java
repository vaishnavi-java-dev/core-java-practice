package revison2;
interface Payment{
	void pay();
}
class CreditCard implements Payment{
	public void pay() {
		
		System.out.println("Paying through CreditCard");
	}
}
class UPI implements Payment{
	public void pay() {
		System.out.println("Paying through UPI");
	}
}
class Cash implements Payment{
	public void pay() {
		System.out.println("Payong through Cash");
	}
}

public class InterfaceandPolymorphism {

	public static void main(String[] args) {
		Payment p1 = new CreditCard();
		p1.pay();
		
		Payment p2 = new UPI();
		p2.pay();
		
		Payment p3 = new Cash();
		p3.pay();

	}

}
