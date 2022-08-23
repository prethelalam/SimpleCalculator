//package SimpleCalculator;
import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		System.out.println("Welcome user.");
		System.out.println();
		System.out.println("If you would like to add, enter 1.");
		System.out.println("If you would like to subtract, enter 2.");
		System.out.println("If you would like to multiply, enter 3.");
		System.out.println("If you would like to divide, enter 4.");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		String scanned = sc.nextLine();
		int option = Integer.parseInt(scanned);
		
		if (option == 1) {
			System.out.println("Enter the first number you would like to add:");
			Scanner scan1 = new Scanner(System.in);
			String add1 = scan1.nextLine();
			int num1 = Integer.parseInt(add1);
			System.out.println();
			
			System.out.println("Enter the second number you would like to add to the first number:");
			Scanner scan2 = new Scanner(System.in);
			String add2 = scan2.nextLine();
			int num2 = Integer.parseInt(add2);
			System.out.println();
			
			System.out.print("The sum is: ");
			System.out.println(num1 + num2);
			System.out.println();
	}
		else if (option == 2) {
			System.out.println("Enter the first number you would like to subtract from:");
			Scanner scan3 = new Scanner(System.in);
			String subtract1 = scan3.nextLine();
			int num3 = Integer.parseInt(subtract1);
			System.out.println();
			
			System.out.println("Enter the second number you would like to subract from the first number:");
			Scanner scan4 = new Scanner(System.in);
			String subtract2 = scan4.nextLine();
			int num4 = Integer.parseInt(subtract2);
			System.out.println();
			
			System.out.print("The value is: ");
			System.out.println(num3 - num4);
			System.out.println();
		}
		
		else if (option == 3) {
			System.out.println("Enter the first number you would like multiplied:");
			Scanner scan5 = new Scanner(System.in);
			String multiply1 = scan5.nextLine();
			int num5 = Integer.parseInt(multiply1);
			System.out.println();
			
			System.out.println("Enter the second number you would like multiplied to the first number");
			Scanner scan6 = new Scanner(System.in);
			String multiply2 = scan6.nextLine();
			int num6 = Integer.parseInt(multiply2);
			System.out.println();
			
			System.out.print("The value is: ");
			System.out.println(num5 * num6);
			System.out.println();
			System.out.println();
		}

		  
}
}
