package revison2;

import java.util.Scanner;
public class SumOfAllElementsArrays {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter size of an array : ");
		int s= sc.nextInt();
		
		int [] arr= new int[s];
		
		System.out.println("Enter Elements : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
		sc.close();

	}

}
