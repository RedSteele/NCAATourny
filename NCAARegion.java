/**
 * NCAARegion
 *		Establishes a region on the NCAA bracket
 * 
 */

import java.util.ArrayList;

public class NCAARegion{
	
	private NCAATeam[] teams;
	private int numTeams = 16;
	private int numGames = 8;
	private NCAAGame[] games = new NCAAGame[8];

	/**
	 * Constructor
	 * 		sets up region for first round
	 *
	 * @param teams - array of all the teams in the competition
	 * @param  region - name(in String format) of the region
	 * 
	 */
	public NCAARegion(NCAATeam[] teams){
		this.teams = teams;
		for(int j = 0; j<numGames; j++){
			a = teams[j];
			b = teams[15-j];
			games[j] = new Game(a,b);
		}	
	}

	/**
	 * playRegion
	 * 		plays the games until final, winning team from this region is found
	 *
	 * @return  NCAATeam
	 */
	public NCAATeam playRegion(){
		while(numTeams > 1){
			numTeams = numTeams/2;
			numGames = numGames/2;
			NCAATeam[] newTeams = new NCAATeam[numTeams];
			NCAAGame[] newGames = new NCAAGame[numGames];
			for(int i = 0; i < games.length(); i++){
				newTeams[i] = games[i].computeWinner();
			}
			for(int j = 0; j<numGames; j++){
				a = newTeams[j];
				b = newTeams[numTeams-j];
				newGames[j] = new Game(a,b);
			}	
		}
		return newGames[0];
	}	
}