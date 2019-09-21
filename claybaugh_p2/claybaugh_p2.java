package claybaugh_p2;

import java.util.Scanner;

public class claybaugh_p2 {

	public static void main(String[] args) {
		int flag;
		double height;
		double weight;
		double BMI = 0.00;
		
		Scanner user = new Scanner(System.in);
		
		System.out.println("Would you like to enter your height/weight in the Metric System? (1 for yes, 0 for no)");
		flag = user.nextInt();
		
		if (flag == 1) {
			System.out.println("Please enter your height in meters.");
			height = user.nextDouble();
			System.out.println("Please enter your weight in kilograms.");
			weight = user.nextDouble();
			BMI = weight / (height * height);
		}
		else if (flag == 0) {
			System.out.println("Please enter your height in inches.");
			height = user.nextDouble();
			System.out.println("Please enter your weight in pounds.");
			weight = user.nextDouble();
			BMI = (703 * weight) / (height * height);
		}
		else {
			System.out.print("Error: Invalid Input.");
			System.exit(0);
		}
		
		System.out.printf("Your BMI: %.1f\n\n", BMI);
		System.out.println("Underweight: <18.5");
		System.out.println("Normal Weight: 18.5 - 24.9");
		System.out.println("Overweight: 25 - 29.9");
		System.out.println("Obesity: 30+");
		
	}

}
