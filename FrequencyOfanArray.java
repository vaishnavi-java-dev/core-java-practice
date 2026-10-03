package revison2;

import java.util.Scanner;
public class FrequencyOfanArray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter size of an array : ");
		int s= sc.nextInt();
		
		int [] arr= new int[s];
		System.out.println("Enter elements : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		boolean counted[] = new boolean[s];
		
		for(int i=0;i<arr.length;i++) {
			if(counted[i]) {
				continue;
			}
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					counted[j]=true;
				}
			}
			System.out.println(arr[i]+ " " + count);
		}

	}

}
