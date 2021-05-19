package config;

import javax.swing.JFrame;


public class FrameConfiguration 
{
	private JFrame frame;
	
	public FrameConfiguration()
	{
		frame = new JFrame();
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
	

		frame.setVisible(true);
	}

	public JFrame getFrame() 
	{
		return frame;
	}

}
