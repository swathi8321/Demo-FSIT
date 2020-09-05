package practice;

import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Input how many numbers");
		int len = s.nextInt();
		
		int[] arr = new int[len];
		
		System.out.println("enter the numbers");
		for(int i=0;i<len;i++) {
			arr[i]= s.nextInt();
			
		}
		
		Sort s1 = new Sort();
		int[] arr1 = s1.sort(arr);
		
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		

	}

	private int[] sort(int[] arr) {
		// TODO Auto-generated method stub
		int sortedarr[] = new int[arr.length];
		int temp;
		 boolean swapped; 
		for(int i =0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++) {
				
				if (arr[j] > arr[j + 1])  
                { 
                    // swap arr[j] and arr[j+1] 
                    temp = arr[j]; 
                    arr[j] = arr[j + 1]; 
                    arr[j + 1] = temp; 
                    swapped = true; 
                } 
			}
		}
		
		return arr;
		
	}

}
