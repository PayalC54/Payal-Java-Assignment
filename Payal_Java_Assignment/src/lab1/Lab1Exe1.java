package lab1;
	import java.util.Scanner;

	public class Lab1Exe1 {
		
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);

			System.out.println("Please enter any number - ");
			int num = sc.nextInt();
			System.out.println(num);
			
			int a,cube,sum=0;
			int b = num;
			
			while( num!=0 ) {
				
				a=num%10;
				num= num/10;
				cube=a*a*a;
				sum= sum + cube;
			}
			sc.close();
			System.out.println("sum of cubes of digits of "+ b + " is "+ sum);
		}

}
