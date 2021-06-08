package lab1;


	import java.util.Scanner;

	public class Lab1Exe8 {

		 static Boolean CheckNumber(int n) {
			int a=n;
			while(a>2) {
				a=a/2;
			}
			 if(a%2==0)
			 {
				 return true;
			 }
			 else
			 {
				return false;	
			}
				}
		 	 public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter any  Number:");
			int n = sc.nextInt();
			if(CheckNumber(n))
			{
				System.out.println("power of 2");
			}
			else {
				System.out.println(" Not power of 2");
			}
			
			 sc.close();
		}
		
	}


