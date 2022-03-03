package simplecalculator;

import java.util.Scanner;

public class Calci {
	static int result;
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			while(true){
				System.out.println("Enter first number::");
				int firstNumber = sc.nextInt();
				System.out.println("Enter second number::");
				int secondNumber = sc.nextInt();
				
				System.out.println("Enter 1, For addition(+)");
				System.out.println("Enter 2, For subtraction(-)");
				System.out.println("Enter 3, For multiplication(*)");
				System.out.println("Enter 4, For division(/)");
				System.out.println("Enter 0, To Exit");

				System.out.println("\nEnter your choice::");
				int choice = sc.nextInt();

				switch(choice){
				case 1: System.out.println("Adding the numbers:");
				add(firstNumber, secondNumber);
				break;
				case 2: System.out.println("Subtracting the numbers:");
				subtract(firstNumber, secondNumber);
				break;
				case 3: System.out.println("Multiplying the numbers:");
				 multiply(firstNumber, secondNumber);
				break;
				case 4: System.out.println("Dividingthe numbers:");
				divide(firstNumber, secondNumber);
				break;
				case 0: System.out.println("Thank you");
				System.exit(0);
				break;
				default: System.out.println("Incorrect input!! Please re-enter choice from the menu");
				}
			}
		}
		public static void add(int num1, int num2){ //addition method
			result = num1+num2;
			System.out.println("Addition result="+ result);
	}
		public static void subtract(int num1, int num2){ //subtraction method
			result = num1-num2;
			System.out.println("Subtraction result="+ result);
		}
		public static void multiply(int num1, int num2){ //multiplication method
			result = num1*num2;
			System.out.println("Mul result="+ result);
		}
		public static void divide(int num1, int num2){ //division method
			result = num1/num2;
			System.out.println("Division result="+ result);
		}

	}

