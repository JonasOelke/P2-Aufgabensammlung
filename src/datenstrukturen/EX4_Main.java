package datenstrukturen;

import java.util.LinkedList;

public class EX4_Main {

	public static void main(String[] args) throws InterruptedException {
		LinkedList<EX4_Quiz> quiz = new LinkedList<EX4_Quiz>();
		
		quiz.add(new EX4_Quiz("Klimawandel", "Ist der Klimawandeleine Lüge?", "Erdbeerkäse"));
		quiz.add(new EX4_Quiz("Einhörner", "Haben männliche Einhörner zwei Hörner? "
				+ "Und wären sie dann nicht zweihörner? Und falls nein, wie unterscheiden sie sich denn von weiiblichen Einhörnern?", "Wurstbrot"));
		quiz.add(new EX4_Quiz("Mathematik", "Würdest du die Riemansche Vermutung bestätigen?", "Wenn ich Hemden trage würde, JA!"));
		
		while (quiz.size() > 0) {
			EX4_Quiz question = quiz.pop();
			System.out.println(question.getTitle() + "\n----------------\n" + question.getQuestion());
			Thread.sleep(3000);
			System.out.println(question.getAnswer());
			System.out.println();
			Thread.sleep(1000);
		}
		
		
	}

}
