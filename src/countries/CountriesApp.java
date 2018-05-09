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
		

		
		

	}
	
	public static void optionTwo() {}

}
