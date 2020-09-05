package practice;

import java.util.Scanner;

public class FindRadius {

	public double area(int r) {
		
		return 3.14*r*r;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int radius = s.nextInt();
		FindRadius f = new FindRadius();
		System.out.println(f.area(radius));
	}

}
