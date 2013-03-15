import java.util.Scanner;
import java.io.*;


public class readNCAA {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner reader = new Scanner(new File("ncaa_data.csv"));

		while (reader.hasNextLIne()){
			String next = reader.nextLine();
			String[] values = next.split(",");

			for (String s : values) {
				System.out.println(s + " ");
			}

			System.out.println();
		}
	}	
}