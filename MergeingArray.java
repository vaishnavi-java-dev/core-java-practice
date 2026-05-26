package revison2;

import java.util.Arrays;
import java.util.Scanner;
public class MergeingArray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter size of an array : ");
		int s=sc.nextInt();
		
		int[] arr1= new int[s];
		System.out.println("Enter elements : ");
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter size of an arr2 : ");
		
		int s2= sc.nextInt();
		int [] arr2= new int[s2];
		
		System.out.println("Enter elemnts : ");
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=sc.nextInt();
		}
		int n=arr1.length;
		int m=arr2.length;
		
		int[] merged= new int[n+m];
		int k=0;
		
		for(int i=0;i<n;i++) {
			merged[k]=arr1[i];
			k++;
		}
		for(int i=0;i<m;i++) {
			merged[k]=arr2[i];
			k++;
		}
		System.out.println("Merged Array : " + Arrays.toString(merged));
		sc.close();

	}

}
