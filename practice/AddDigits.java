package practice;

import java.util.Scanner;

public class AddDigits {

	int addDigit(int digit){
		
		int sum =0;
		while(digit!=0) {
			
			sum +=digit%10;
			digit=digit/10;
			
		}
		
		return sum;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int digit = s.nextInt();
		AddDigits a = new AddDigits();
		System.out.println(a.addDigit(digit));
	}

}
