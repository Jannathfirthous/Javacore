package p1;

import java.util.Scanner;

public class ValidateInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter an integer: ");
		while (true) {
			try {
				int i = reader.nextInt();
				System.out.println("Validate!!");
				break;
			} catch (Exception ex) {
				System.err.println("You didn't enter Int " + ex + "So not validate!!!");

				break;
			}
		}

	}

}
