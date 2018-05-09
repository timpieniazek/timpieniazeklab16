package countries;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CountriesTextFile {
	public static void readFromFile(String dir, String fileName) {
		Path readFile = Paths.get(dir, fileName);
		File file = readFile.toFile();

		try {
			FileReader fr = new FileReader(file);

			BufferedReader reader = new BufferedReader(fr);

			String line = reader.readLine();

			while (line != null) {
				System.out.println(line);
				line = reader.readLine();
			}
			
			reader.close();
		} catch (IOException e) {
			System.out.println("Something bad happened...");
			// e.printStackTrace();
		}
	}

	public static void writeToFile(Country country, String dir, String fileName) {
		Path writeFile = Paths.get(dir, fileName);
		File file = writeFile.toFile();

		try {
			PrintWriter outW = new PrintWriter(new FileOutputStream(file, true)); // FileOutputStream can take 2 parameters
			outW.println(country);
			outW.close(); // flushes data closes the stream

		} catch (FileNotFoundException e) {
			System.out.println("The file was not found here...");
			// e.printStackTrace();
		}

	}

	public static void createFile(String dirString, String fileString) {

		Path filePath = Paths.get(dirString, fileString);

		if (Files.notExists(filePath)) {
			try {
				Files.createFile(filePath);
				System.out.println("Your file was created successfully!");
			} catch (IOException e) {
				System.out.println("Something went wrong with the file creation!");
				// e.printStackTrace();
			}
		}
	}

	public static void createDirectory(String path) {
		// Saves the Path of the directory, using .get() method from Paths class
		Path dirPath = Paths.get(path);

		if (Files.notExists(dirPath)) {

			try {
				Files.createDirectories(dirPath);
			} catch (IOException e) {
				System.out.println("Something went wrong!");
				// e.printStackTrace();
			}

		}

	}

}
