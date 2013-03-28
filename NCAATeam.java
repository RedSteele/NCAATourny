/**
 * NCAATeam
 * 		Creates a team object
 */

import java.util.Scanner;
import java.io.*;

public class NCAATeam{
	
	private String seed;
	private String name;
	private String winPercent;
	private String region;

	/**
	* 
	* Constructor
	*
	* @param teamNumber - the number of the team you want to create(1-64) as designated by the file being read in from
	**/
	public NCAATeam(int teamNumber) throws FileNotFoundException{
		int teamNum = teamNumber - 1;
		fileReader reader = new fileReader();
		String[][] teams = reader.getTeams();
		seed = teams[teamNum][1];
		name = teams[teamNum][2];
		winPercent = teams[teamNum][3];
		region = teams[teamNum][4];
	}

	/**
	* 
	* getters
	*
	**/
	public String getSeed(){
		return seed;
	}

	public String getName(){
		return name;
	}

	public String getWinPercent(){
		return winPercent;
	}

	public String getRegion(){
		return region;
	}
}