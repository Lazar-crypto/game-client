package config;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class ClientConfiguration 
{

	private Socket socket;
	private BufferedReader serverOutput;
	private PrintStream clientInput;
	
	public ClientConfiguration() 
	{
		try 
		{
			socket = new Socket("localhost",9999);
			serverOutput = new BufferedReader(
		                new InputStreamReader(
		                		socket.getInputStream()));;
		    clientInput = new PrintStream(socket.getOutputStream());
		} 
		catch (IOException e)
		{
			e.printStackTrace();
			System.err.println("Failiure during client connection");
		}
	}

	public BufferedReader getServerOutput() 
	{
		return serverOutput;
	}

	public PrintStream getClientInput() 
	{
		return clientInput;
	}

	public Socket getSocket() {
		return socket;
	}
	
	
}
