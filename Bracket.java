/**
* Bracket
*		sets up a March Madness bracket
*
**/
import java.io.FileNotFoundException;

public class Bracket{
	
	private NCAATeam eastFinal;
	private NCAATeam westFinal;
	private NCAATeam northFinal;
	private NCAATeam southFinal;
	private NCAATeam[] totalTeams = new NCAATeam[64];
	private NCAATeam[] teamsInNorth = new NCAATeam[16];
	private NCAATeam[] teamsInSouth = new NCAATeam[16];
	private NCAATeam[] teamsInEast = new NCAATeam[16];
	private NCAATeam[] teamsInWest = new NCAATeam[16];
	private NCAARegion[] regions = new NCAARegion[4];

	/**
	* Constructor
	*
	**/
	public Bracket() throws FileNotFoundException{
		int eastCount = 0;
		int westCount = 0;
		int northCount = 0;
		int southCount = 0;
		for(int i = 0; i<totalTeams.length; i++){
			totalTeams[i] = new NCAATeam(i+1);
		}
		for(int j = 0; j<totalTeams.length; j++){
			if(totalTeams[j].getRegion().equals("North")){
				teamsInNorth[northCount] = totalTeams[j];
				northCount++;
			}else if(totalTeams[j].getRegion().equals("South")){
				teamsInSouth[southCount] = totalTeams[j];
				southCount++;
			}else if(totalTeams[j].getRegion().equals("East")){
				teamsInEast[eastCount] = totalTeams[j];
				eastCount++;
			}else{
				teamsInWest[westCount] = totalTeams[j];
				westCount++;
			}
		}
		regions[0] = new NCAARegion(teamsInNorth, "North");
		regions[1] = new NCAARegion(teamsInSouth, "South");
		regions[2] = new NCAARegion(teamsInEast, "East");
		regions[3] = new NCAARegion(teamsInWest, "West");
	}

	public String playBracket() throws FileNotFoundException{
		northFinal = regions[0].playRegion();
		southFinal = regions[1].playRegion();
		eastFinal = regions[2].playRegion();
		westFinal = regions[3].playRegion();

		return northFinal.getName();    // temporary return; this method is still not finished
	}
}