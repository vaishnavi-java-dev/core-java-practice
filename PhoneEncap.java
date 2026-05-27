package revison2;

class Mobile {
	
	private String brand ;
	private Double storage;
	private int price;
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public void setStorage(double storage) {	
		this.storage=storage;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public double getStorage() {
		return storage;
	}
	
	public int getPrice() {
		return price;	
	}
}
public class PhoneEncap {

	public static void main(String[] args) {
		Mobile m1 = new Mobile();
		
		m1.setBrand("Samsung");
		System.out.println(m1.getBrand());
		
		m1.setStorage(85);
		System.out.println(m1.getStorage());
		
		m1.setPrice(100000);
		System.out.println(m1.getPrice());
		

	}

}
