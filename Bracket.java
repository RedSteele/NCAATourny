/**
* Bracket
*		sets up a March Madness bracket
*
**/
public class Bracket{
	
	private Team eastFinal;
	private Team westFinal;
	private Team northFinal;
	private Team southFinal;
	private Team[] totalTeams = new Team[64];
	private Region[] regions = new Region[4];

	/**
	* Constructor
	*
	**/
	public Bracket(){
		int eastCount = 0;
		int westCount = 0;
		int northCount = 0;
		int southCount = 0;
		for(int i = 0; i<totalTeams.length; i++){
			totalTeams[i] = new Team(i+1);
		}
		for(int j = 0; j<totalTeams.length; j++){
			if(totalTeams[j].getRegion.equals("North")){
				teamsInNorth[northCount] = totalTeams[j];
				northCount++;
			}else if(totalTeams[j].getRegion.equals("South")){
				teamsInSouth[southCount] = totalTeams[j];
				southCount++;
			}else if(totalTeams[j].getRegion.equals("East")){
				teamsInEast[eastCount] = totalTeams[j];
				eastCount++;
			}else{
				teamsInWest[westCount] = totalTeams[j];
				westCount++;
			}
		}
		regions[0] = new Region(teamsInNorth, "North");
		regions[1] = new Region(teamsInSouth, "South");
		regions[2] = new Region(teamsInEast, "East");
		regions[3] = new Region(teamsInWest, "West");
	}
}