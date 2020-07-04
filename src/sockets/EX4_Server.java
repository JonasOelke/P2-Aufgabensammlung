package sockets;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EX4_Server {

	public static void main(String[] args) throws IOException {

		ServerSocket serverSocket = new ServerSocket(8080);
		Socket socket = serverSocket.accept();
		
		InputStream inputStream = socket.getInputStream();
		Scanner networkScanner = new Scanner(inputStream);
		
		File file = new File("EX4_Server.txt");
		FileWriter fileWriter = new FileWriter(file, true);
		
		while (networkScanner.hasNext()) {
			String msgString = networkScanner.nextLine();
			System.out.println(msgString);
			fileWriter.write(msgString);
			fileWriter.flush();
		}

		networkScanner.close();
		inputStream.close();
		fileWriter.close();
		socket.close();
		serverSocket.close();
	}

}
