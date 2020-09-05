package practice;

public class Pattern1 {

	public void pattern1() {

		for (int j = 0; j < 11; j++) {
			for (int i = 0; i < 10; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public void pattern2() {
		for (int j = 1; j < 8; j++) {
			for (int i = 1; i < 9 - j; i++) {
				System.out.print(i);
			}
			System.out.println();
		}

	}

	public void pattern3(String s) {
		for (int j = 0; j < s.length(); j++) {

			for (int i = j; i < s.length() - j; i++) {
				System.out.print(s.charAt(i));
			}

			System.out.println();
		}

	

	}

	public static void main(String[] args) {
		Pattern1 p = new Pattern1();
		p.pattern1();
		p.pattern2();
		p.pattern3("MANIPAL");
	}

}
