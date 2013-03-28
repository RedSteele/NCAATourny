/**
* fileReader
* 		reads in data from the NCAA file
*
**/

import java.util.Scanner;

public class fileReader{
	
	private String[][] teams;
	private Scanner reader;

	/**
	*Constructor
	*
	**/
	public fileReader(){
		teams = new String[64][5];
		reader = new Scanner(new File("ncaa_data_2013.csv"));
	}

	/**
	*getTeams
	*	returns the information about the teams read in from the file
	*
	*
	**/
	public String[][] getTeams(){
		int counter = 0;
		while (reader.hasNextLine()){
			String next = reader.nextLine();
			String[] values = next.split(",");
			teams[counter] = values;
			counter++;
		}
		return teams;	
	}
}