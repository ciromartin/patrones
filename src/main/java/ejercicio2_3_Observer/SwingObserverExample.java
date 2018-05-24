package ejercicio2_3_Observer;

import java.awt.BorderLayout;

import javax.swing.*;


public class SwingObserverExample {
	JFrame frame;
	
	public static void main(String[] args)
	{
		SwingObserverExample example = new SwingObserverExample();
		example.go();
		
	}
	
	public void go() {
		frame = new JFrame();
		JButton button = new JButton("Should I do it?");
		button.addActionListener(new AngelListener());
		button.addActionListener(new DevilListener());
		frame.getContentPane().add(BorderLayout.CENTER,button);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		frame.setVisible(true);
	}
}
