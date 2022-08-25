//package SimpleCalculator; (include for eclipse but not VS code)
import java.text.NumberFormat;
import java.util.Scanner;

public class SimpleCalculator {
	static void Calculator() {

		System.out.println("Welcome user.");
		System.out.println();
		System.out.println("If you would like to add, press 1 and hit enter.");
		System.out.println("If you would like to subtract, press 2 and hit enter.");
		System.out.println("If you would like to multiply, press 3 and hit enter.");
		System.out.println("If you would like to divide, press 4 and hit enter.");
		System.out.println("If you would like to find the power of a number, press 5 and hit enter.");
		System.out.println("If you would like to take the square root of a number, press 6 and hit enter.");
		System.out.println("If you would like to convert a decimal to a percentage, press 7 and hit enter.");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		String scanned = sc.nextLine();
		int option = Integer.parseInt(scanned);
		System.out.println();

		if (option == 1) {
			System.out.println("Enter the first number you would like to add:");
			Scanner scan1 = new Scanner(System.in);
			String add1 = scan1.nextLine();
			Double num1 = Double.parseDouble(add1);
			System.out.println();
			
			System.out.println("Enter the second number you would like to add to the first number:");
			Scanner scan2 = new Scanner(System.in);
			String add2 = scan2.nextLine();
			Double num2 = Double.parseDouble(add2);
			System.out.println();
			
			System.out.print("The sum is: ");
			System.out.println(num1 + num2);
			System.out.println();
		}

		else if (option == 2) {
			System.out.println("Enter the first number you would like to subtract from:");
			Scanner scan3 = new Scanner(System.in);
			String subtract1 = scan3.nextLine();
			Double num3 = Double.parseDouble(subtract1);
			System.out.println();
			
			System.out.println("Enter the second number you would like to subract from the first number:");
			Scanner scan4 = new Scanner(System.in);
			String subtract2 = scan4.nextLine();
			Double num4 = Double.parseDouble(subtract2);
			System.out.println();
			
			System.out.print("The value is: ");
			System.out.println(num3 - num4);
			System.out.println();
		}
		
		else if (option == 3) {
			System.out.println("Enter the first number you would like multiplied:");
			Scanner scan5 = new Scanner(System.in);
			String multiply1 = scan5.nextLine();
			Double num5 = Double.parseDouble(multiply1);
			System.out.println();
			
			System.out.println("Enter the second number you would like multiplied to the first number");
			Scanner scan6 = new Scanner(System.in);
			String multiply2 = scan6.nextLine();
			Double num6 = Double.parseDouble(multiply2);
			System.out.println();
			
			System.out.print("The value is: ");
			System.out.println(num5 * num6);
			System.out.println();
		
		}
		
		else if (option == 4) {
			System.out.println("Enter the first number you would like to divide by: ");
			Scanner scan7 = new Scanner(System.in);
			String divide1 = scan7.nextLine();
			double num7 = Double.parseDouble(divide1);
			System.out.println();

			System.out.println("Enter the second number you would like to divide by the first number: ");
			Scanner scan8 = new Scanner(System.in);
			String divide2 = scan8.nextLine();
			double num8 = Double.parseDouble(divide2);
			System.out.println();

			System.out.println("The value is: ");
			System.out.println(num7 / num8);
			System.out.println();
		}

		else if (option == 5){
			System.out.println("Enter the first number you would like as your base: ");
			Scanner scan9 = new Scanner(System.in);
			String base = scan9.nextLine();
			Double num9 = Double.parseDouble(base);
			System.out.println();

			System.out.println("Enter the second number that you would like your base (first number) to be raised too: ");
			Scanner scan10 = new Scanner(System.in);
			String power = scan10.nextLine();
			Double num10 = Double.parseDouble(power);
			System.out.println();

			System.out.println("The value is: ");
			System.out.println(Math.pow(num9, num10));
			System.out.println();
		}

		else if (option == 6){
			System.out.println("Enter the number you would like to take the sqaure root of: ");
			Scanner scan11 = new Scanner(System.in);
			String root = scan11.nextLine();
			Double num11 = Double.parseDouble(root);
			System.out.println();

			System.out.println("The value is: ");
			System.out.println(Math.sqrt(num11));
			System.out.println();
		}

		else if (option == 7){
			System.out.println("Enter the decimal you would like to convert into a percentage");
			Scanner scan12 = new Scanner(System.in);
			String decimal = scan12.nextLine();
			Double num12 = Double.parseDouble(decimal);
			System.out.println();

			NumberFormat PercentFormat = NumberFormat.getPercentInstance();
			PercentFormat.setMinimumFractionDigits(2);

			System.out.println("The percentage is: ");
			System.out.println(PercentFormat.format(num12));
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		while (true){
		Calculator();
		}
}
}
