package jUnitTests;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataCheck {
	public boolean checkWord_ex1(String word) {
		Pattern pattern = Pattern.compile("^[sS][a-z]*[[a-zß]&&[^s]]$");
		Matcher matcher = pattern.matcher(word);
		
		return matcher.find();
	}
	
	public boolean checkWord_ex2(String word) {
		
		Pattern pattern = Pattern.compile("^([A-Za-z][a-z]* ?)+$");
		Matcher matcher = pattern.matcher(word);
		
		return matcher.find();
	}
	
	public boolean checkWord_ex3(String word) {
		
		Pattern pattern = Pattern.compile("^[abcdABCD][a-z]*n$");
		Matcher matcher = pattern.matcher(word);
		
		return matcher.find();
	}

}
