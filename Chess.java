import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Date;
public class Chess {
	public static void main (String [] args) {
		int i=0;
		String player="";
		while (!(player.equals("Q"))) {
			Scanner scnr=new Scanner(System.in);
			System.out.println("Enter a player.");
			player=scnr.nextLine();
			i=i+1;
			}
		String players[]=new String [i];
		//players[i] =str.split(player);
		players[i-1]=player;
		while (i>0) {
			System.out.print(players[i-1]+" ");
			i=i-1;
		}
		Calendar cal = Calendar.getInstance();
		Date date=new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		System.out.println(date/*sdf.format(cal.getTime())*/);
	}
}
