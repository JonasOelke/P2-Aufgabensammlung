package sockets;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class EX6_Socket {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Socket socket = new Socket("localhost", 8081);
		OutputStream outputStream = socket.getOutputStream();
		
		EX6_UserData userData = new EX6_UserData("Hans", "wurst");
		
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
		objectOutputStream.writeObject(userData);
		
	
	}

}
