package threads;

public class EX3_Minions {

	public static void main(String[] args) {
		Runnable minionRunnable = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Bananaaaaa, Bananaaaaa, ich bin weg");
				
			}
		};
		
		Thread minionThread = new Thread(minionRunnable);
		
		minionRunnable.run();

	}

}
