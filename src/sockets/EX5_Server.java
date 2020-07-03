package sockets;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EX5_Server {

	public static void main(String[] args) throws IOException, InterruptedException {
		ServerSocket serverSocket = new ServerSocket(8000);
		Socket socket = serverSocket.accept();

		System.out.println("Connection established!");

		OutputStream outputStream = socket.getOutputStream();
		PrintWriter printWriter = new PrintWriter(outputStream);

		Scanner userScanner = new Scanner(System.in);

		InputStream inputStream = socket.getInputStream();
		Scanner scanner = new Scanner(inputStream);

		try {
			File file = new File(scanner.nextLine());
			System.out.println(file.getName());
			if (file.canRead()) {
				FileReader fileReader = new FileReader(file);
				BufferedReader bufferedReader = new BufferedReader(fileReader);

				String textfile = "";
				String lineString = bufferedReader.readLine();

				while (lineString != null) {
					textfile += "\n" + lineString;
					lineString = bufferedReader.readLine();
				}
				bufferedReader.close();

				System.out.println(textfile);
				printWriter.println(textfile);
				printWriter.flush();
				printWriter.close();

			} else {
				System.out.println("Datei nicht gefunden");
				printWriter.println("Die Datei konnte nicht auf dem Sever gefunden werden");
				printWriter.flush();
				printWriter.close();
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		
		String endString = userScanner.next();
		
		userScanner.close();
		scanner.close();
		socket.close();
		serverSocket.close();

	}

}
