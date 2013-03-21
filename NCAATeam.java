/**
 * NCAATeam
 * 		A class to create a team file including Win Percent, seed, and name
 */

import java.util.Scanner;
import java.io.*;

public class NCAATeam extends readNCAA{

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println(NCAATeam(1, returnTeams()));
	}
	public static String NCAATeam(int teamNumber, String[][] teams) throws FileNotFoundException{
		String seed = teams[teamNumber][1];
		String name = teams[teamNumber][2];
		String winPercent = teams[teamNumber][3];
		String region = teams[teamNumber][4];

		return seed + " " + winPercent + " " + name + " " + region;
	}	
}