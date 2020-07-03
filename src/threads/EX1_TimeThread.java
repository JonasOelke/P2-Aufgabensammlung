package threads;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EX1_TimeThread extends Thread {

	@Override
	public void run() {

		while (true) {
			SimpleDateFormat formater = new SimpleDateFormat("HH:mm:ss");
			Date date = new Date(System.currentTimeMillis());
			System.out.println(formater.format(date));

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public void kill() {
		System.exit(0);
	}

}
