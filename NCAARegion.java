/**
 * NCAARegion
 *		Establishes a region on the NCAA bracket
 * 
 */

import java.io.FileNotFoundException;

public class NCAARegion{
	
	private String region;
	private NCAATeam[] teams;
	private int numTeams = 16;
	private int numGames = 8;
	private NCAAGame[] games = new NCAAGame[8];
	private NCAATeam a;
	private NCAATeam b;

	/**
	 * Constructor
	 * 		sets up region for first round
	 *
	 * @param teams - array of all the teams in the competition
	 * @param  region - name(in String format) of the region
	 * 
	 */
	public NCAARegion(NCAATeam[] teams, String region){
		this.region = region;
		this.teams = teams;
		for(int j = 0; j<numGames; j++){
			a = teams[j];
			b = teams[15-j];
			games[j] = new NCAAGame(a,b);
		}	
	}

	/**
	 * playRegion
	 * 		plays the games until final, winning team from this region is found
	 *
	 * @return  NCAATeam
	 */
	public NCAATeam playRegion() throws FileNotFoundException{
		NCAATeam winner = new NCAATeam(2);
		while(games.length > 1){
			numTeams = numTeams/2;
			numGames = numGames/2;
			NCAATeam[] newTeams = new NCAATeam[numTeams];
			NCAAGame[] newGames = new NCAAGame[numGames];
			for(int i = 0; i < games.length; i++){
				newTeams[i] = games[i].computeWinner();
			}
			for(int j = 0; j<numTeams; j+=2){
				a = newTeams[j];
				b = newTeams[j+1];
				newGames[j/2] = new NCAAGame(a,b);
			}
			games = newGames;
			winner = newGames[0].computeWinner();	
		}
		return winner;
	}	
}