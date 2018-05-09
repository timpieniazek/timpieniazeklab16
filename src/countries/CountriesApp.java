package countries;

import java.util.Scanner;

public class CountriesApp {

	public static void main(String[] args) {
		// Initializes directory and filename, if not created
		String dir = "resources";
		String fileName = "countries.txt";

		CountriesTextFile.createDirectory(dir);
		CountriesTextFile.createFile(dir, fileName);

		Scanner scan = new Scanner(System.in);
		int menuInput;
		String countryInput;
		boolean cont = true;

		for (int i = 0; i < 29; i++) {
			System.out.print("-");
		}
		System.out.println("\nWelcome to our Countries App!");
		for (int i = 0; i < 29; i++) {
			System.out.print("-");
		}

		while (cont == true) {

			System.out.println("\n1.) Display contents of " + fileName);
			System.out.println("2.) Enter a new country.");
			System.out.println("3.) Remove an existing country.");
			System.out.println("4.) Exit program.");

			menuInput = Validator.getInt(scan, "\n::?:: ", 1, 4);

			switch (menuInput) {
			case 1:
				displayCountry();
				break;
			case 2:
				enterCountry();
				break;
			case 3:
				removeCountry();
				break;
			default:
				cont = false;
				break;
			}

		}
		
		System.out.println("\nThank you!\nGoodbye!");

	}

	public static void displayCountry() {

	}

	public static void enterCountry() {

	}

	public static void removeCountry() {

	}

}
