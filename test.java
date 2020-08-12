import java.util.*;
import java.io.*;

public class TextProcessing {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		while (true) {
			System.out.println("Enter file name:");
			String filename = keyboard.nextLine();
			int count = 0;
			try {
				Scanner file = new Scanner(new File(filename));
				while (file.hasNextLine()) {
					file.nextLine();
					count++;
				}
				System.out.println(count);
				FileWriter writer = new FileWriter("report.txt");
				writer.write("In the text from the file named " + filename + ":\n\n");
				writer.write("The number of lines is: " + count);
				writer.close();
				System.out.println("Saved to report.txt");
				return;
			} catch (IOException e) {
				System.out.println("File IO error: " + e.getMessage());
			}
		}
	}
}