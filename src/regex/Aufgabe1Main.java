package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aufgabe1Main {

	public static void main(String[] args) {

		String text = "Sonne sonnig saß sitzen Sessel singen sammeln singen sagen Sage aus, reißen, Spliss, Spross, huhu, hu hu, singe2, singe2e ";
		String regex = "[Ss][a-zß]*[[a-zß]^[s]]\\s";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		
		while(matcher.find()) {
			System.out.println(matcher.group());
		}

	}

}
