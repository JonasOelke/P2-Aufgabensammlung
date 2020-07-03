package sockets;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EX6_Server {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ServerSocket serverSocket = new ServerSocket(8081, 2);
		Socket socket = serverSocket.accept();
		InputStream inputStream = socket.getInputStream();
		ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

		Object object = objectInputStream.readObject();
		
		if (object instanceof EX6_UserData) {
			EX6_UserData userData = (EX6_UserData) object;
			System.out.println(userData.toString());
		} else {
			System.out.println("The object sent was not an instance of the class UserData");
		}

	}

}
