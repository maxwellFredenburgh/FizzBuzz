/*
 * Maxwell Fredenburgh
 * Example of famous 'FizzBuzz' problem
 */
import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Number for Fizz: ");
		int x= keyboard.nextInt();
		System.out.println("Number for Buzz: ");
		int y= keyboard.nextInt();
		
		String out;
		
		for(int i=1;i<101;i++) {
			out = "";
			if(i%x==0)
				out+="Fizz";
			if(i%y==0)
				out+="Buzz";
			if(out=="")
				out+=i;
			System.out.println(out);
		}

	}

}
