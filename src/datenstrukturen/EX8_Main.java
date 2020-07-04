package datenstrukturen;

import java.util.ArrayList;

public class EX8_Main {

	private interface IMovable {
		public void move();

		public int getX();

		public int getY();
	}

	private class Pipe implements IMovable{
		private int x;
		private int y;

		public Pipe(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}

		public void move() {
			x--;
		}

	}

	public class Ball implements IMovable {
		private int x;
		private int y;

		public Ball(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}

		public void move() {
			y--;
		}

	}

	public static void main(String[] args) {
		ArrayList<IMovable> movables  = new ArrayList<IMovable>();
		EX8_Main dieseDingHier = new EX8_Main();
		
		movables.add(dieseDingHier.new Ball(24, 10));
		movables.add(dieseDingHier.new Ball(43, 15));
		movables.add(dieseDingHier.new Pipe(85, 13));
		movables.add(dieseDingHier.new Pipe(96, 14));
		
		for (IMovable movable : movables) {
			movable.move();
		}
		
		for (IMovable movable : movables) {
			System.out.print("(" + movable.getX() + "," + movable.getY() + ") ");
		}

	}

}
