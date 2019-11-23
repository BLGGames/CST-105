import java.util.Scanner;

public class Temperatures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a temperature in Farenheit to convert into Celcius");
		double Farenheit = input.nextDouble();
		
		double Celcius = (5.0/9) * (Farenheit - 32);
		System.out.println("Farenheit "+ Farenheit + " is " + Celcius + " in Celcius");
		
		System.out.print("Enter a temperature in Celcius to be converted to Farenheit");
		double celcius = input.nextDouble();
		
		double farenheit = (9.0/5) * (celcius + 32);
		System.out.println("Celcius " + celcius + " is " + farenheit + " in Farenheit");
	}

}
