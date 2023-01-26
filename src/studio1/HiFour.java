package studio1;

import java.util.Scanner;

/**
 * From Sedgewick and Wayne, COS 126 course at Princeton
 * 
 */
public class HiFour {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the first person's name?");
		String s0 = scan.nextLine();
		System.out.print("What is the second person's name? ");
		String s1 = scan.nextLine();
		System.out.print("What is the third person's name? ");
		String s2 = scan.nextLine();
		System.out.print("What is the fourth person's name? ");
		String s3 = scan.nextLine();
		System.out.println("Greetings " + s0 + ", " + s1 + ", " + s2 + ", and " + s3 + "." );
		//
		// Say hello to the names in s0 through s3.
		//

	}
}
