package sockets;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class EX2_Socket {

	public static void main(String[] args) throws UnknownHostException, IOException {

		Socket socket = new Socket("localhost", 8080);
		InputStream inputStream = socket.getInputStream();
		OutputStream outputStream = socket.getOutputStream();
		PrintWriter printWriter = new PrintWriter(outputStream);
		
		Scanner inputScanner = new Scanner(inputStream);
		Scanner userInputScanner = new Scanner(System.in);
		
		while (true) {
			
			String userMsgString = userInputScanner.next();
			printWriter.println(userMsgString);
			printWriter.flush();
			
			System.out.print(inputScanner.nextLine());
			
		}
		
	}

}
