
import java.io.*;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;


public class Tournment
{
public static void main(String [] args) throws IOException
{
HashMap<String,Integer> teamdetails=new HashMap<String,Integer>();
teamdetails.put("A", 0);
teamdetails.put("B", 1);
teamdetails.put("C", 3);
teamdetails.put("D", 2);


int wins;
String teamName;
int gameCounter=0;


KnockoutTeam [] game = new KnockoutTeam [4];
int k=0;
for (Entry<String,Integer> entrymap : teamdetails.entrySet()) {
	teamName =entrymap.getKey();
	wins= entrymap.getValue();
	game[k++] = new KnockoutTeam(teamName, wins);
}
for (int i = 0; i < game.length-1; i+=2)
{
for(int j= 0; j< game.length; j+=2)
{
if(i > game.length)
j--;

System.out.println(game[i+1].getName()+ " VS." + game[j].getName());

}
}
//KnockoutGame
}

}
class KnockoutTeam
{
String teamName;
int wins;

public KnockoutTeam()
{
}

public KnockoutTeam (String teamName, int wins)
{
this.teamName = teamName;
this.wins = wins;
}

public String getName()
{
return teamName;
}
public int getWins()
{
return wins;
}
}