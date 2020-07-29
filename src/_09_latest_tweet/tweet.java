package _09_latest_tweet;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class tweet {
	public static void main(String[] args) {
		tweet t = new tweet();
		t.code();
	}

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
	private void code() {
		frame.setPreferredSize(new Dimension(500, 100));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
		
	}
}
