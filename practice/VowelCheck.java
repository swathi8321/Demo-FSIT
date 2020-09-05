package practice;

import java.util.Scanner;

public class VowelCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Input a character");
		int c = s.next().charAt(0);
		
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
			System.out.println("is vowel");
		}else {
			System.out.println("Not a vowel");
		}
		
	}

}
