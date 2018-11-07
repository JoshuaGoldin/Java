package Statistics;
/**
 * Makes prediction about outcome of the AFC NFL playoff.
 * 
 * @author JoshuaGoldin
 * 
 */
import java.util.*;
import java.util.LinkedList;

import Statistics.List;
//import Statistics.LinkedList;
public class Predictor {
	int Broncos;
	int Patriot;
	String Bengals;
	int Texans;
	int Chiefs;
	int Steelers;
	String name;
	String AFCTeams[]={"Broncos", "Patriots", "Bengals", "Texans", "Chiefs", "Steelers"};
	int AFCRatings[]={1645, 1644, 1628, 1532, 1673, 1638};
	//LinkedList<String> teams = new LinkedList<String>();
	String AFCTeamsN[] = new String [AFCTeams.length];
	int len=AFCTeams.length;
	int p=0;
	public Predictor(String name){
		System.out.println(name);
		//return name;
	}
	public void BroncosR(int rating){
		int BroncosRate=rating;
	}
	public int Broncos(int BroncosRate) {
		return BroncosRate;
	}
	public int BengalsR(int rating){
		int BengalsRate=rating;
		System.out.println("The Bengals have a rating of "+BengalsRate);
		return BengalsRate;
	}
	public String Bengals(String Bengals){
		System.out.println("The Bengals have a rating "+Bengals);
		return Bengals;
	}
	public int SteelersR(int rating){
		int SteelersRate=rating;
		return rating;
	}
	public int Steelers(int SteelersRate){
		return SteelersRate;
	}
	public void Playoff(int BengalsRate){
		//teams.add("Texans");
		double BengalsChance=1/(Math.pow(10.0, (-(AFCRatings[2]-AFCRatings[5]+50))/400.0)+1)*100;
		double SteelersChance=1/(Math.pow(10.0, (-(AFCRatings[5]-AFCRatings[2]-50))/400.0)+1)*100;
		System.out.println("The Bengals chances of winning are "+Math.round(BengalsChance)+"%");
		System.out.println("The Steelers chances of winning are "+Math.round(SteelersChance)+"%");
		int SteelersW=0;
		int BengalsW=0;
		for (int i=0; i<100; i++){
			Random rand=new Random();
			int randomNum=rand.nextInt(100);
			//System.out.println(randomNum);
			if (randomNum<SteelersChance){
				//System.out.println("The Steelers won.");
				SteelersW=SteelersW+1;
			}
			else{
				//System.out.println("The Bengals won.");
				BengalsW=BengalsW+1;
			}
		}
		if (BengalsW>SteelersW){
			for (p=0; len>p; p++){
				AFCTeamsN[p]=AFCTeams[p];
			}
			String winner=Bengals;
			System.out.println(winner +"B");
			System.out.println(AFCTeamsN[p-1]);
		}
		if (SteelersW>BengalsW){
			for (p=0; len>p; p++){
				AFCTeamsN[p]=AFCTeams[p];
			}
			int winner=Steelers;
			System.out.println(winner +"P");
		}
		System.out.println("The Steelers won "+SteelersW+" times.");
		System.out.println("The Bengals won "+BengalsW+" times.");
	}
	public static void main(String[] args){
		//LinkedList<String> team = new LinkedList<String>();
		//team.add("Texans");
		//System.out.println(team.getFirst());
		Predictor Broncos=new Predictor("Broncos");
		//Predictor("Broncos");
		System.out.println(Broncos.Broncos(1600));
		Predictor Bengals=new Predictor("Bengals");
		System.out.println(Bengals.BengalsR(1628));
		Predictor Steelers=new Predictor("Steelers");
		System.out.println(Steelers.Steelers(1638));
		Predictor Playoff=new Predictor("Chiefs");
		//Predictor("Texans");
		Playoff.Playoff(1628);
	}
}
