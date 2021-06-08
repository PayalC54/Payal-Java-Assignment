package lab1;

import java.util.Scanner;

public class Lab1Exe5 {
	// Definition of CalculateSum method
	static int CalculateSum(int num){
					System.out.println(" Sum of natural numbers divisible by 3 Or 5 :");
					int sum=0;
					for(int i=1;i<=num;i++){
						
					if(i%3==0 || i%5==0){
					sum=sum+i;
					}
					
						}
					
						return sum;
						}

						// Main method
						public static void main(String[] args){					{
							//reading input from user
							Scanner sc = new Scanner(System.in); 
							System.out.println("Enter any integer:");
							int num = sc.nextInt();
							//"CalculateSum" Method invoked
							System.out.println(CalculateSum(num));
							sc.close();
							}
						
						}
						
}


