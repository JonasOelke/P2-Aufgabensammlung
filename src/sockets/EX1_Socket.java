package sockets;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class EX1_Socket {
	
	public static void main(String[] args) {
		
		Socket socket;
		OutputStream outputStream;
		InputStream inputStream;
		Scanner networkInputScanner;
		
		try {
			socket = new Socket("127.0.0.1", 8080);
			outputStream = socket.getOutputStream();
			inputStream = socket.getInputStream();
			networkInputScanner = new Scanner(inputStream);
			Scanner userInputScanner = new Scanner(System.in);
			String usernameString = userInputScanner.next();
			
			PrintWriter output = new PrintWriter(outputStream);
			output.println(usernameString);
			output.flush();
			
			System.out.println(networkInputScanner.nextLine());
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}

}

