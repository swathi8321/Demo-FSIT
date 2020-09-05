package practice;

import java.util.Scanner;

public class SumValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Input how many numbers");
		int len = s.nextInt();
		
		int[] arr = new int[len];
		int sum =0;
		System.out.println("enter the numbers");
		for(int i=0;i<len;i++) {
			arr[i]= s.nextInt();
			sum+=arr[i];
		}
		
		System.out.println("the sum is"+sum);

	}

}
