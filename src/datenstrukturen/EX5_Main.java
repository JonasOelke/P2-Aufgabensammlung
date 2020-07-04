package datenstrukturen;

public class EX5_Main {

	public static void main(String[] args) {
		
	EX5_Pipe[] pipes = {
			new EX5_Pipe(150, 150, 20, 50),
			new EX5_Pipe(223, 25, 25, 60),
			new EX5_Pipe(957, 363, 5, 5),
			new EX5_Pipe(45, 39, 23, 69)
	};
	
	for (EX5_Pipe pipe : pipes) {
		System.out.print("(" + pipe.getX() + "," + pipe.getY() + ") ");
	}
	
	System.out.println();
	
	Boolean xIsLessThanZero = false;
	
	while (!xIsLessThanZero) {
		for (EX5_Pipe pipe : pipes) {
			pipe.move();
			if (pipe.getX() < 0) {
				pipe.setX(pipe.getInitialX());
				xIsLessThanZero = true;
			}
		}
	}
	
	for (EX5_Pipe pipe : pipes) {
		System.out.print("(" + pipe.getX() + "," + pipe.getY() + ") ");
	}

	}

}
