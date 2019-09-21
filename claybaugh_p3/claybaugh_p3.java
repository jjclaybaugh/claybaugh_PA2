package claybaugh_p3;

import java.util.Scanner;

public class claybaugh_p3 {

	public static void main(String[] args) {
		String topics [] = new String [5];
		int responses [] [] = new int [5] [10];
		int flag = 0;
		int userNum = 0;
		int i, j;
		double tot1, tot2, tot3, tot4, tot5;
		double high = 0.0;
		double low = 1000.0;
		int low1 = 0;
		int high1 = 0;
		double sum1 = 0.0;
		double sum2 = 0.0;
		double sum3 = 0.0;
		double sum4 = 0.0;
		double sum5 = 0.0;
		
		topics[0] = "Videogames";
		topics[1] = "Movies";
		topics[2] = "Music";
		topics[3] = "Books";
		topics[4] = "Art";
		
		Scanner user = new Scanner(System.in);
		
		for (i=0; i<5; i++) {
			for (j=0; j<10; j++) {
				responses[i][j] = 0;
			}
		}
		
		System.out.println("Please rate the following topics in importance to you (1 being unimportant, 10 being very important");
		
		while (flag == 0) {
			System.out.println("Video Games:");
			i = user.nextInt();
			responses[0][i - 1] = responses[0][i - 1] + 1;
			System.out.println("Movies:");
			i = user.nextInt();
			responses[1][i - 1] = responses[1][i - 1] + 1;
			System.out.println("Music:");
			i = user.nextInt();
			responses[2][i - 1] = responses[2][i - 1] + 1;
			System.out.println("Books:");
			i = user.nextInt();
			responses[3][i - 1] = responses[3][i - 1] + 1;
			System.out.println("Art:");
			i = user.nextInt();
			responses[4][i - 1] = responses[4][i - 1] + 1;
			
			userNum = userNum + 1;
			System.out.println("Would you like to have another user answer? (0 for yes, 1 for no");
			flag = user.nextInt();
		}
		
		i = 0;
		
		while (i<10) {
			sum1 = sum1 + (responses[0][i] * (i + 1));
			i++;
		}
		
		tot1 = sum1;
		sum1 = sum1 / userNum;
		i = 0;
		
		while (i<10) {
			sum2 = sum2 + (responses[1][i] * (i + 1));
			i++;
		}
		
		tot2 = sum2;
		sum2 = sum2 / userNum;
		i = 0;
		
		while (i<10) {
			sum3 = sum3 + (responses[2][i] * (i + 1));
			i++;
		}
		
		tot3 = sum3;
		sum3 = sum3 / userNum;
		i = 0;
		
		while (i<10) {
			sum4 = sum4 + (responses[3][i] * (i + 1));
			i++;
		}
		
		tot4 = sum4;
		sum4 = sum4 / userNum;
		i = 0;
		
		while (i<10) {
			sum5 = sum5 + (responses[4][i] * (i + 1));
			i++;
		}
		
		tot5 = sum5;
		sum5 = sum5 / userNum;
		
		if(tot1 > high) {
			high = tot1;
			high1 = 0;
		}
		
		if(tot2 > high) {
			high = tot2;
			high1 = 1;
		}
		
		if(tot3 > high) {
			high = tot3;
			high1 = 2;
		}
		
		if (tot4 > high) {
			high = tot4;
			high1 = 3;
		}
		
		if(tot5 > high) {
			high = tot5;
			high1 = 4;
		}
		
		if(tot1 < low) {
			low = tot1;
			low1 = 0;
		}
		
		if(tot2 < low) {
			low = tot2;
			low1 = 1;
		}
		
		if(tot3 < low) {
			low = tot3;
			low1 = 2;
		}
		
		if(tot4 < low) {
			low = tot4;
			low1 = 3;
		}
		
		if(tot5 < low) {
			low = tot5;
			low1 = 4;
		}
		
		System.out.println("\t\t 1 \t 2 \t 3 \t 4 \t 5 \t 6 \t 7 \t 8\t 9 \t 10 \t AVG");
		System.out.print("Video Games:\t" + responses[0][0] + "\t" + responses[0][1] + "\t" + responses[0][2] + "\t" + responses[0][3]);
		System.out.print("\t" + responses[0][4] + "\t" + responses[0][5] + "\t" + responses[0][6] + "\t" + responses[0][7] + "\t");
		System.out.println(responses[0][8] + "\t" + responses[0][9] + "\t" + sum1);
		System.out.print("Movies:\t\t" + responses[1][0] + "\t" + responses[1][1] + "\t" + responses[1][2] + "\t" + responses[1][3]);
		System.out.print("\t" + responses[1][4] + "\t" + responses[1][5] + "\t" + responses[1][6] + "\t" + responses[1][7] + "\t");
		System.out.println(responses[1][8] + "\t" + responses[1][9] + "\t" + sum2);
		System.out.print("Music:\t\t" + responses[2][0] + "\t" + responses[2][1] + "\t" + responses[2][2] + "\t" + responses[2][3]);
		System.out.print("\t" + responses[2][4] + "\t" + responses[2][5] + "\t" + responses[2][6] + "\t" + responses[2][7] + "\t");
		System.out.println(responses[2][8] + "\t" + responses[2][9] + "\t" + sum3);
		System.out.print("Books:\t\t" + responses[3][0] + "\t" + responses[3][1] + "\t" + responses[3][2] + "\t" + responses[3][3]);
		System.out.print("\t" + responses[3][4] + "\t" + responses[3][5] + "\t" + responses[3][6] + "\t" + responses[3][7] + "\t");
		System.out.println(responses[3][8] + "\t" + responses[3][9] + "\t" + sum4);
		System.out.print("Art:\t\t" + responses[4][0] + "\t" + responses[4][1] + "\t" + responses[4][2] + "\t" + responses[4][3]);
		System.out.print("\t" + responses[4][4] + "\t" + responses[4][5] + "\t" + responses[4][6] + "\t" + responses[4][7] + "\t");
		System.out.println(responses[4][8] + "\t" + responses[4][9] + "\t" + sum5);
		
		System.out.println("The lowest Category was " + topics[low1] + " with a total of: " + low);
		System.out.println("The highest category was " + topics[high1] + " with a total of: " + high);
	}

}
