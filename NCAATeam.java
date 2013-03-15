/**
 * NCAATeam
 * 		A class to create a team file including Win Percent, seed, and name
 */
public class NCAATeam {
	private int seed;
	private double winPercent;
	private String name;

	public NCAATeam(int seed, double winPercent, String name){
		this.seed=seed;
		this.winPercent=winPercent;
		this.name=name;
	}
}