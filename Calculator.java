import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class Calculator {

	public static void main(String[] args) {

		double result;
		double inputA, inputB;
		char operator;
		boolean T = true;
		boolean T1 = true;
		// Scanner input = new Scanner(System.in);
		Maths Maths = new Maths();

		while (T) {

			do {
				try {

					result = 0;
					System.out.println(
							"Simple calculator(allowed operations: +,-,*,/,v(square root),^(pow)): \n  Please type input: \n ");
					Scanner input = new Scanner(System.in);
					inputA = input.nextDouble();
					operator = input.next().charAt(0);
					inputB = input.nextDouble();

					switch (operator) {
					case '+':
						result = Maths.add(inputA, inputB);
						break;
					case '-':
						result = Maths.subtract(inputA, inputB);
						break;
					case '*':
						result = Maths.multiply(inputA, inputB);
						break;
					case '/':
						result = Maths.divide(inputA, inputB);
						break;
					case 'v':
						result = Maths.sqroot(inputA);
						break;
					case '^':
						result = Maths.powm(inputA, inputB);
					default:
						System.out.println("Wrong input. Try again.");
						break;

					}
					System.out.println(result);

				} catch (Exception e) {
					System.out.println("Wrong input. Try again.");

				}
			} while (T1);
		}

	}
}
