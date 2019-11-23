import java.util.Scanner;

public class PositiveInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mainNumber;
		int num1;
		int num2;
		int num3;
		int num4;
		int num5;
		int firstNumber ;
		int secondNumber ;
		int thirdNumber ;
		int fourthNumber ;
		int fifthNumber ;
		int totalNumber ;
		
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter a positive 5-integer digit ");
		mainNumber = input.nextInt();

		num1 = mainNumber / 10;
		firstNumber = mainNumber % 10;
		
		num2 = num1 / 10;
		secondNumber = num1 % 10;
		
		num3 = num2 / 10;
		thirdNumber = num2 % 10;
		
		num4 = num3 / 10;
		fourthNumber = num3 % 10;
		
		num5 = num4 / 10;
		fifthNumber = num4 % 10;
		
		totalNumber = firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber;
		
		System.out.println("The sum of "+ fifthNumber + "+" + fourthNumber + "+" + thirdNumber + "+" + secondNumber + "+" + firstNumber + " is: " + totalNumber);
	}

}
