import java.util.Scanner;
import java.io.*;

public class readNCAA {
	private static int counter = 0;
	private static int valuePerTeam=1;
	
	public static String[][] returnTeams() throws FileNotFoundException{
		String[][] team = new String[64][5];
		Scanner reader = new Scanner(new File("ncaa_data_2013.csv"));

		while (reader.hasNextLine() && counter<63){
			String next = reader.nextLine();
			String[] values = next.split(",");
			
			if(valuePerTeam<5){
				team[counter][valuePerTeam] = values[valuePerTeam];
				valuePerTeam++;
			}
			if(valuePerTeam == 5){
				counter++;
				valuePerTeam=1;
			}
		}
		return team;
	}
}