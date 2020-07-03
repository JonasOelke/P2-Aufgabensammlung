package sockets;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EX1_Server {
	
	public static void main(String[] args) {
		try {
			
			ServerSocket server = new ServerSocket(8080);
			Socket socket = server.accept();
			
			
			InputStream inputStream = socket.getInputStream();
			Scanner inpScanner = new Scanner(inputStream);
			
			String username = inpScanner.nextLine();
			System.out.println(username);
			
			OutputStream outStream = socket.getOutputStream(); 
			PrintWriter outputPrintWriter = new PrintWriter(outStream);
			
			outputPrintWriter.println(username);
			outputPrintWriter.flush();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

