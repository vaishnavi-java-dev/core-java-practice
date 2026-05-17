package revison2;

import java.util.Scanner;
interface Calculator{
	void add(int a , int b);
	void substract(int a, int b);
}

class Simplecalculator implements Calculator{
	
	public void add(int a , int b) {
		System.out.println("Addition is " + (a+b));
	}
	
	public void substract(int a,int b) {
		System.out.println("Substraction is : "+(a-b));
	}
}

public class IntefacewithUserInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a :");
		int a = sc.nextInt();
		System.out.println("Enter b :");
		int b = sc.nextInt();
		Calculator c= new Simplecalculator();
		c.add(5, 5);
		c.substract(2, 2);
		

	}

}
