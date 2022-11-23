import java.util.*;
import java.io.*;

public class Calculator_Trial {
	public static double eResult = 0;

	public static void main(String[] args) {

		System.out.println(
				"Calculator with user input- Please enter the numbers for below operations and operaor(+,-,*,/,Power of)");

		openExitScreen();
	}

	public static void openExitScreen() {

		while (true) {
			// System.out.print("\033[H\033[2J");
			// System.out.flush();
			showManu();
			Scanner userInput = new Scanner(System.in);
			System.out.println("Enter any operator 1 to 5 number as above to do oprations and ");
			System.out.println("enter number 6 if want to continue operations with already derived answer");
			System.out.println ("or press 0 to exit");
			try {
				int operator = userInput.nextInt(); 

				if (operator >= 1 && operator <= 4) {//To take input for +,-,*,/
					System.out.println("Enter the first number");
					double num1 = userInput.nextDouble();

					System.out.println("Enter the second number");
					double num2 = userInput.nextDouble();
					chooseOperator(operator, num1, num2);
					System.out.println("Result from above operation :" + eResult);

				} else if (operator == 5) {	//To take power of input			
					System.out.println("Enter the number");
					double num1  = userInput.nextDouble();
					System.out.println("Enter the power number");
					double num2 = userInput.nextDouble();
					chooseOperator(operator, num1, num2);
					System.out.println("Result from above operation :" + eResult);
					
				} else if (operator == 6) {//To continue with same answer
					double num1 = eResult;
					System.out.println("now first number is : " + eResult);
					System.out.println("if you want to do more operations with same answer : " + eResult);
					System.out.println("Enter the any 1 to 5 number operator from above");
					operator = userInput.nextInt();
					if (operator >= 1 && operator <= 5) {

						System.out.println("Enter the second number");
						double num2 = userInput.nextDouble();

						chooseOperator(operator, num1, num2);
						System.out.println("Result from :" + eResult);
					}
				} else { // else it will check the operator either to exit or show error message
					if (operator == 0) {
						System.out.println("EXIT");
						System.exit(0); // exit the program if entered 0

					} else {
						System.out.println("You have entered wrong choice"); // print wrong choice and continue the program
																				// in loop

					}

				}
			} catch (InputMismatchException exp) {
				System.out.println ("Exception Found  .... Please enter valid number");
						//+ "" + exp.getMessage());
			}
			
		}

	}
	/*
	 * // Function to clearScreen public static void clearScreen() {
	 * 
	 * System.out.print("\033[H\033[2J");
	 * 
	 * System.out.flush();
	 * 
	 * }
	 */

	// Function showMaanu
	public static void showManu() {
		System.out.println("1 - Addition");
		System.out.println("2 - Subtraction");
		System.out.println("3 - Multiplication");
		System.out.println("4 - Devision");
		System.out.println("5 - Power of");
		System.out.println("6 - Continue");
		System.out.println("0 - Exit");
	}

	// Function to choose operator
	public static void chooseOperator(int operator, double num1, double num2) {
		// Scanner userInput = new Scanner(System.in);
		// System.out.println("Enter the first number");
		// double num1 = userInput.nextDouble();

		// System.out.println("Enter the second number");
		// double num2 = userInput.nextDouble();

		switch (operator) {

		case 1:
			eResult = Addition(num1, num2);
			break;

		case 2:
			eResult = Subtraction(num1, num2);
			break;

		case 3:
			eResult = Multiplication(num1, num2);
			break;

		case 4:
			eResult = Devision(num1, num2);
			break;
			
		case 5:
			eResult = Power(num1, num2);
			break;

		default:
			break;

		}
		;
	}

	// Functions for different operations

	public static double Addition(double num1, double num2) {
		double eResult = num1 + num2;
		// System.out.println("Answer is : " + eResult);
		return eResult;
	};

	public static double Subtraction(double num1, double num2) {
		double Result = num1 - num2;
		// System.out.println("Answer is : " + Result);
		return Result;

	};

	public static double Multiplication(double num1, double num2) {
		double Result = num1 * num2;
		// System.out.println("Answer is : " + Result);
		return Result;

	};

	public static double Devision(double num1, double num2) {
		double Result = num1 / num2;
		// System.out.println("Answer is : " + Result);
		return Result;
	};
	
	public static double Power(double num1, double num2) {
		
		double Result = 1;
		for(int i = 1; i <= num2; i++) {
			Result = num1 * Result ;
		};		
		// System.out.println("Answer is : " + Result);
		return Result;
	};

}
