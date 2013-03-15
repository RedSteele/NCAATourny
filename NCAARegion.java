/**
 * NCAARegion
 *
 * 		A class to hold the teams that are in the same region
 */

class NCAARegion {

	private String[] teams;
	private int teamnum;
	
	/**
	 * NCAARegion
	 *
	 * 		Constructor
	 * 		
	 * @param  teamnum - number of teams in the region
	 * @param  teams - the array of teams in the region
	 */
	public NCAARegion(int teamnum, String[] teams) {
		this.teamnum=teamnum;
		this.teams = teams;
	}

	/**
	 * teamAt
	 *
	 * 		returns the team at location n
	 *
	 * @param n - the team location
	 */
	public NCAATeam teamAt(int n) {
		
	}

}