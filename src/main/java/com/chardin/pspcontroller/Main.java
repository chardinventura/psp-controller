package com.chardin.pspcontroller;

public class Main {

	public static void main(String[] args) throws java.awt.AWTException, java.io.IOException {

		try (Socket socket = new Socket(30666)) {

			Controles controles = new Controles();

			System.out.println("IP server: " + java.net.InetAddress.getLocalHost().getHostAddress());

			while (true)
				controles.simularKeys(socket.recibirKey());
		}
	}
}
