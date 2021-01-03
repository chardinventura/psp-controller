package com.chardin.pspcontroller;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Socket extends DatagramSocket{

	private byte[] buf;
	private DatagramPacket datagramPacket;

	public Socket(int port) throws SocketException {
		super(port);

		buf = new byte[17];

		datagramPacket = new DatagramPacket(buf, buf.length);
	}

	public char[] recibirKey() throws IOException {

		receive(datagramPacket);

		return new String(datagramPacket.getData(), datagramPacket.getOffset(), datagramPacket.getLength()).toCharArray();
	}
}
