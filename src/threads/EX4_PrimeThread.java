package threads;

import java.util.ArrayList;

public class EX4_PrimeThread extends Thread {

	private ArrayList<Integer> primes = new ArrayList<Integer>();
	private int a;
	private int b;

	public EX4_PrimeThread(int a, int b) {

		this.a = a;
		this.b = b;

	}

	public void run() {
		for (int i = a; i < b; i++) {
			Boolean isPrime = true;
			for (int k = 2; k < i; k++) {
				Float quotient = (float) i / k;
				Float rest = quotient % 1;
				if (rest == 0.0)
					isPrime = false;
			}
			if (isPrime) primes.add(i);

		}
	}

	public ArrayList<Integer> getList() {
		return primes;

	}

}
