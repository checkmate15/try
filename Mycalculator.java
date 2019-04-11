package calculator;
import java.util.Scanner;
public class Mycalculator {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Type your name plzz = ");
		String name = input.nextLine();
		
		System.out.println("Hello "+name +", you can only do math for certain limit. ");
		System.out.println("i'm still working on it and will do some update, Thank you    ");
		System.out.println("AND results will show in double variable, example = 1.00, 2.00 ");
		
		System.out.println("Type your first number = ");
		double a = input.nextInt();
		
		System.out.println("Type your second number = ");
		double b = input.nextInt();
		
		
		System.out.println("if Addition Type 1");
		System.out.println("If Subtraction Type 2");
		System.out.println("if Multiplication Type 3");
		System.out.println("if division Type 4");
		int t = input.nextInt();
		
		if  (t == 1){
			double total = a+b;
			System.out.println(name + ", Your addition = "+ total);
			
		}else if (t == 2) {
			double total = a-b;
			System.out.println(name + ", Your Subtraction = "+ total);
		}else if (t == 3) {
			double total = a*b;
			System.out.println(name + ", Your Multiplication = " + total);
		}else if (t == 4) {
			double total = a/b;
			System.out.println(name +", Your Division = " + total);
		}else {
			System.out.println ("Sorry "+ name +" , what ever you are looking for we don't have it, We are still updating");
		}
	}
} 