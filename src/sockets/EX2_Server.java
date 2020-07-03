package sockets;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EX2_Server {

	public static void main(String[] args) throws IOException {

		ServerSocket serverSocket = new ServerSocket(8080,2);
		Socket socket = serverSocket.accept();
		
		OutputStream outputStream = socket.getOutputStream();
		PrintWriter printWriter = new PrintWriter(outputStream);

		
		InputStream inputStream = socket.getInputStream();
		Scanner inputScanner = new Scanner(inputStream);
		
		while (true) {
			String msg = inputScanner.next();
			
			
			printWriter.println(msg);
			printWriter.flush();
			
		}
	}

}
