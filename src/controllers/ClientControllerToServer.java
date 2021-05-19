package controllers;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import config.ClientConfiguration;
import config.FrameConfiguration;

//clientcontroller - za sve sto saljemo serveru
public class ClientControllerToServer implements KeyListener 
{
	ClientConfiguration clientConfiguration;
	FrameConfiguration frameConfiguration;
	ClientControllerFromServer clientControllerFromServer;
	
	public ClientControllerToServer()
	{
		clientConfiguration = new ClientConfiguration();
		frameConfiguration = new FrameConfiguration();
		frameConfiguration.getFrame().addKeyListener(this);
		clientControllerFromServer = new ClientControllerFromServer(
										clientConfiguration.getServerOutput(),clientConfiguration.getClientInput());
		clientControllerFromServer.start();
		
		
	}

	@Override
	public void keyTyped(KeyEvent e) 
	{
		
	}

	@Override
	public void keyPressed(KeyEvent e) 
	{
		String pressedKeyChar = KeyEvent.getKeyText(e.getKeyCode());
		//send to server
		clientConfiguration.getClientInput().println(pressedKeyChar);
	}

	@Override
	public void keyReleased(KeyEvent e)
	{
		
	}
	
	
}
