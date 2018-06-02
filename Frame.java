import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Frame extends JFrame{
	
	public Frame(String game){
		super(game);
		setPreferredSize(new Dimension(500,700)); // Corners of game arena: (401,0), (401,600), (1199,0), (1199,600)
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}
}