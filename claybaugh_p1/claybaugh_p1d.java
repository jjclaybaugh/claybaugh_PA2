package claybaugh_p1;

import java.util.Scanner;

public class claybaugh_p1d {
	public static void main(String[] args) {
		int input;
		int first;
		int second;
		int third;
		int fourth;
	
		Scanner user = new Scanner(System.in);
		
		input = user.nextInt();
		third = (input / 1000) % 10;
		fourth = (input / 100) % 10;
		first = (input / 10) % 10;
		second = input % 10;
		
		if (first < 7) {
			first = first + 3;
		}
		else {
			first = first - 7;
		}
		
		if (second < 7) {
			second = second + 3;
		}
		else {
			second = second - 7;
		}
		
		if (third < 7) {
			third = third + 3;
		}
		else {
			third = third - 7;
		}
		
		if (fourth < 7) {
			fourth = fourth + 3;
		}
		else {
			fourth = fourth - 7;
		}

		System.out.printf("%d%d%d%d", first, second, third, fourth);
	}
}
