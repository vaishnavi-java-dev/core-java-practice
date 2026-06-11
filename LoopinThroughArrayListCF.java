package revison2;

import java.util.ArrayList;


public class LoopinThroughArrayListCF {

	public static void main(String[] args) {

		ArrayList<Integer>  num = new ArrayList<>();
		
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50);
		num.add(60);
		
		System.out.println("Using for loop : ");
		for(int i=0 ; i<num.size();i++) {
			
			System.out.println(num.get(i));
			
		}
		// Enhanced Loop
		
		System.out.println("Enhanced for loop ; ");
		
		for(int numbers : num) {
			
			System.out.println(numbers);
		}

	}

}
