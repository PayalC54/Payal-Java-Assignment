
package lab1;
import java.util.Scanner;

	public class Lab1Exe7 {

		public boolean checkNumber(int number) {
//convert integer to string using to String method
			String str = Integer.toString(number);
			//
			boolean flag = false;

			for (int i = 0; i < str.length() - 1; i++) {    //  Yes<= //No<
				if (str.charAt(i) < str.charAt(i + 1)) {
					flag = true;
				} else {
					flag = false;
					break;
				}
			}
			return flag;
		}

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			System.out.println("Please enter a number: ");

			int number = sc.nextInt();

			sc.close();

			Lab1Exe7 obj = new Lab1Exe7();

			boolean result = obj.checkNumber(number);

			if (result) {
				System.out.println("This is an increasing number.");
			} else {
				System.out.println("This is NOT an increasing number.");
			}

		}
	}


