/**
 * NCAAGame
 *		sets up a game between two teams and computes the winner
 * 
 */

public class NCAAGame {
	
	private NCAATeam a;
	private NCAATeam b;
	private NCAATeam winner;

	private double aWinPercent;
	private double bWinPercent;
	private double abWinPercent;

	/**
	 * NCAAGame
	 * 		Constructor
	 *
	 * @param  a - One of the teams playing in this game
	 * @param  b - The other team playing in this game
	 * 
	 */
	public NCAAGame(NCAATeam a, NCAATeam b){
		this.a = a;
		this.b = b;
		aWinPercent = Double.parseDouble(a.getWinPercent());
		bWinPercent = Double.parseDouble(b.getWinPercent());
	}

	/**
	 * calcWinPercentA
	 *		calculates the winning percentage of A when playing B
	 * 
	 */
	public void calcWinPercentA(){
		abWinPercent = (aWinPercent*(1-bWinPercent))/((aWinPercent*(1-bWinPercent)) + (bWinPercent*(1-aWinPercent)));
	}

	/**
	 * computeWinner
	 * 		calculates and returns the winner of the game using a's calculated winning percentage against b
	 *
	 * @return  Team;
	 */
	public NCAATeam computeWinner(){
		calcWinPercentA();
		double randomNum = Math.random();
		double samples = 100;
		for(int i = 0; i<samples; i++){
		 	randomNum += Math.random();
		}
		randomNum = randomNum/samples;
		if(randomNum <= abWinPercent){
			winner = a;
		}else{
			winner = b;
		}
		return winner;
	}
}