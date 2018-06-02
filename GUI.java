import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.lang.Thread;

public class GUI {

	public GUI() {
		Frame frame = new Frame("Iwas");

		Container contain = frame.getContentPane();
		contain.setLayout(new BorderLayout());
		
		Container container = frame.getContentPane();
		container.setLayout(new BorderLayout());

		GamePanel center = new GamePanel();
		center.setLayout(new BorderLayout());
		center.setBackground(Color.BLACK);

		JButton start = new JButton("Start Game");

		start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Game start");
			}
		});

		center.add(start, BorderLayout.CENTER);

		container.add(center, BorderLayout.CENTER);

		frame.pack();
		frame.setVisible(true);

	}

}