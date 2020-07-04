package datenstrukturen;

public class EX5_Pipe {
	private int initialX;
	private int initialY;
	private int x;
	private int y;
	private int width;
	private int height;
	
	public EX5_Pipe(int x, int y, int width, int height) {
		super();
		this.x = x;
		initialX = x;
		this.y = y;
		initialY = y;
		this.width = width;
		this.height = height;
	}

	public int getInitialX() {
		return initialX;
	}

	public int getInitialY() {
		return initialY;
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

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
	
	public void move() {
		x--;
	}
	
	
	

}
