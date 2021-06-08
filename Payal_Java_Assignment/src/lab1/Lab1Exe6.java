


//Create a class with a method to find the difference between the 
//sum of the squares and the square of the 
//sum of the first n natural numbers
	package lab1;
	import java.util.Scanner;

	public class Lab1Exe6 {

		// Definition of "CalculateDifference" Method
		static int CalculateDifference(int n) {
			int sum1 = 0, sum2 = 0, sq, Sqsum2, Diff;
			// logic for sum of squares
			for (int i = 1; i <= n; i++) {
				sq = i * i;
				sum1 = sum1 + sq;

				// logic for sum of n natural numbers
				sum2 = sum2 + i;
			}
			// logic for square of sum of n natural numbers
			Sqsum2 = sum2 * sum2;
			// logic for finding difference difference between
			// sum of the squares (i.e sum1) and the square of the sum of the first n
			// natural numbers(i.e Sqsum2)

			Diff = sum1 - Sqsum2;

			// Returning difference
			return Diff;
		}

		// Main method
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter any Natural Number:");
			// reading input from user and store into variable n
			int n = sc.nextInt();
			System.out.println("Diff between the sum of the squares of the first" + " " + n + " "
					+ "natural numbers and square of their sum is:" + " " + CalculateDifference(n));
			sc.close();
		}

	}



