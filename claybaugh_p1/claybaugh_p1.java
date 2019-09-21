package claybaugh_p1;

import java.util.Scanner;

public class claybaugh_p1 {

	public static void main(String[] args) {
		int input;
		int first;
		int second;
		int third;
		int fourth;
		
		Scanner user = new Scanner(System.in);
		
		input = user.nextInt();
		first = (input / 1000) % 10;
		second = (input / 100) % 10;
		third = (input / 10) % 10;
		fourth = input % 10;
		
		first = (first + 7) % 10;
		second = (second + 7) % 10;
		third = (third + 7) % 10;
		fourth = (fourth + 7) % 10;
		
		System.out.printf("%d%d%d%d", third, fourth, first, second);
	}

}
