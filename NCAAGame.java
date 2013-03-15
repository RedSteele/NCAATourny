/**
 * NCAAGame
 *		sets up a game between two teams and computes the winner
 * 
 */
public class NCAAGame {
	
	private Team a;
	private Team b;
	private Team winner;

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
	public NCAAGame(Team a, Team b){
		this.a = a;
		this.b = b;
		aWinPercent = Double.parseDouble(a.getWin());
		bWinPercent = Double.parseDouble(b.getWin());
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
	public Team computeWinner(){
		double randomNum = Math.random();
		if(randomNum <= abWinPercent){
			winner = a;
		}else{
			winner = b;
		}
		return winner;
	}
}