package sockets;

import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class EX4_Socket {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Socket socket = new Socket("localhost", 8080);
		OutputStream outputStream = socket.getOutputStream();
		PrintWriter printWriter = new PrintWriter(outputStream);
		
		Scanner userInputScanner = new Scanner(System.in);
				
		while (true) {
			String msgString = userInputScanner.nextLine();
			
			if (msgString.equals("quit")) break;
			
			printWriter.println(msgString);
			printWriter.flush();
		}
		
		userInputScanner.close();
		printWriter.close();
		outputStream.close();
		socket.close();
		

	}

}
