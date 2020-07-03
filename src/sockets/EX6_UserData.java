package sockets;

import java.io.Serializable;

public class EX6_UserData implements Serializable{
	private String username;
	private String password;

	public EX6_UserData(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	@Override
	public String toString() {
		return "EX6_UserData [username=" + username + ", password=" + password + "]";
	}

}
