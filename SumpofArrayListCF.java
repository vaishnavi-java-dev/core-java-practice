package revison2;

import java.util.ArrayList;

public class SumpofArrayListCF {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		
		int sum =0 ; 
		for(int numbers : list) {
			
			sum = sum + numbers;
		}
		
		System.out.println("Sum of ArrayList " + sum);

	}

}
