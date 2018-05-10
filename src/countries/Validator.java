package countries;

import java.util.Scanner;

public class Validator {
	public static int getInt(Scanner sc, String prompt, int min, int max) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			i = getInt(sc, prompt);
			if (i < min || i > max)
				System.out.print("\nThat number is out of bounds. Please try again. ");
			else
				isValid = true;
		}
		return i;
	}
	
	public static int getInt(Scanner sc, String prompt) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				i = sc.nextInt();
				isValid = true;
			} else {
				System.out.print("\nError! Invalid integer value. Try again. ");
			}
			sc.nextLine(); // discard any other data entered on the line
		}
		return i;
	}
	
	public static String getString(Scanner scan, String prompt) {
		System.out.print(prompt);
		String s = scan.next(); // read user entry
		scan.nextLine(); // discard any other data entered on the line
		return s;
	}
}
