package revison2;

import java.util.Scanner;
public class SmallestElementArray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter zize of array: ");
		int s= sc.nextInt();
		
		int [] arr= new int[s];
		System.out.println("Enter elements : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		int smallest=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<smallest) {
				smallest=arr[i];
			}
		}
		System.out.println("Smallest element is : "+ smallest);
		sc.close();

	}

}
