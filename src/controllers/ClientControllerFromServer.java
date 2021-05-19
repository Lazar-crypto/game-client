package controllers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

public class ClientControllerFromServer extends Thread 
{
	private BufferedReader serverOutput;
	private PrintStream clientInput;
	
	public ClientControllerFromServer(BufferedReader serverOutput,PrintStream clientInput) 
	{
		this.serverOutput = serverOutput;
		this.clientInput = clientInput;

	}
	
	@Override
	public void run() 
	{
		String text = null;
		while(true)
		{
			try
			{
				text = serverOutput.readLine();
				System.out.println("From server: " + text);
			} 
			catch (IOException e)
			{
				System.err.println("run() - from server - Failiure during receiving messeges from server");
				e.printStackTrace();
			}
			
		}
		
	}
}
