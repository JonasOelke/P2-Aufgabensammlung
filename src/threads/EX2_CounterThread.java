package threads;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class EX2_CounterThread {

	public static void main(String[] args) {

		ArrayList<Integer> liste = new ArrayList<Integer>();

		Runnable counterThreadRunnable = new Runnable() {

			@Override
			public void run() {
				int roundCount = 0;
				while (roundCount < 100) {

					Random random = new Random();
					int number = random.nextInt(100);
					
					synchronized (liste) {
						liste.add(roundCount);
					}

					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					roundCount++;

				}
			}
		};

		Thread counterThread1 = new Thread(counterThreadRunnable);
		Thread counterThread2 = new Thread(counterThreadRunnable);

		counterThread1.start();
		counterThread2.start();
		

		try {
						
			counterThread1.join();
			counterThread2.join();

			System.out.println("Size of the list: " + liste.size());


		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
