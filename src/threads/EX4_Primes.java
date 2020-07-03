package threads;

public class EX4_Primes {

	public static void main(String[] args) throws InterruptedException {

		EX4_PrimeThread primesThread1 = new EX4_PrimeThread(2, 10000);		
		EX4_PrimeThread primesThread2 = new EX4_PrimeThread(2, 10000);
		EX4_PrimeThread primesThread3 = new EX4_PrimeThread(2, 10000);

		primesThread1.run();
		primesThread2.run();
		primesThread3.run();
		
		primesThread1.join();
		primesThread2.join();
		primesThread3.join();
		
		for (EX4_PrimeThread thread : new EX4_PrimeThread[]{primesThread1, primesThread2, primesThread3}) {
			
			for (int prime : thread.getList()) {
				System.out.print(prime + " ");
			}
			System.out.println();
		}
		
	}

}
