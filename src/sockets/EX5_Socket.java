package sockets;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class EX5_Socket {

	public static void main(String[] args) throws UnknownHostException, IOException {

		Scanner userinputScanner = new Scanner(System.in);

		System.out.println("Welche Datei möchtest du abrufen?");
		String filenameString = userinputScanner.nextLine();
		userinputScanner.close();
		
		Socket socket = new Socket("127.0.0.1", 8000);
		
		InputStream inputStream = socket.getInputStream();
		Scanner inputScanner = new Scanner(inputStream);
		
		OutputStream outputStream = socket.getOutputStream();
		PrintWriter printWriter = new PrintWriter(outputStream);
		
		printWriter.println(filenameString);
		printWriter.flush();
		
		System.out.println("Waiting for messages...");
		
		String fileString = inputScanner.nextLine();
		
		while (inputScanner.hasNext()) {
			fileString += inputScanner.nextLine() + "\n";
		}
		
		System.out.println(fileString);
		printWriter.close();
		socket.close();
	}

}
