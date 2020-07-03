package threads;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EX1_TimerThreadMain {

	public static void main(String[] args) {

		EX1_TimeThread timerThread = new EX1_TimeThread();
		timerThread.start();
		
		Scanner input = new Scanner(System.in);
		boolean quit = false;
		
		while (!quit) {
			if (input.next().equals("quit")) {
				System.out.println("User interruption");
				timerThread.kill();
			}
		}

	}

}
