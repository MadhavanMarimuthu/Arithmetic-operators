package Com;

import java.util.Scanner;

public class ArithmeticOperation {

	public void methods(int a, int b) {
		try {
			System.out.println("\nSUM   " + (a + b));
			System.out.println("subtraction " + (a - b));
			System.out.println("division     " + (a / b));
			System.out.println("multipl    " + (a * b));
			System.out.println("MODULUS     " + (a % b));

		} catch (Exception e) {
			System.out.println("invalid input");

		}
	}

	public static void main(String[] args) {

		while (true) {

			try {
				Scanner value1 = new Scanner(System.in);

				System.out.println("enter the first number :");
				int a = value1.nextInt();
				System.out.println("enter the Second number:");
				int b = value1.nextInt();
				ArithmeticOperation obj = new ArithmeticOperation();

				obj.methods(a, b);
				if (a == 0) {
					break;
				}

			} catch (Exception e) {
				System.out.println("invalid input...");

			}

		}
	}
}
