/*package TestExtra;
import java.util.*;
import java.io.*;
import java.net.*;

public class SpellChecker
{
	public static void main(String[] args) throws IOException
	{
		//File url = new File("test.txt");
		BufferedReader br = new BufferedReader(new FileReader("/CollectionsPOC/src/TestExtra/test.txt"));

		HashSet<String> dict =  new HashSet<String>();

		while(br.readLine() != null ) dict.add(br.toString());
		br.close();

		BufferedReader br1 = new BufferedReader( new FileReader("Spellchecker.java") );
		while(br1.readLine() != null)
		{
			String[] tokens = br1.toString().split("\\W");
			for(String token : tokens)
			   if (token.length() > 1 && !dict.contains(token.toLowerCase()))
			      System.out.println(token);
		}
	}
}*/