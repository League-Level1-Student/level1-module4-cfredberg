package _05_typing_tutor;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class tt implements KeyListener {
	public static void main(String[] args) {
		tt t = new tt();
		t.run();
	}
	
	JLabel label = new JLabel();
	JPanel panel = new JPanel();
	public void run() {
		currentLetter = generateRandomLetter();
		
		JFrame frame = new JFrame("Type or Die");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension(500, 500));
		frame.addKeyListener(this);
		frame.add(panel);
		
		
		
		
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		
		panel.add(label);
		
		label.setText("" + currentLetter);
		frame.pack();
		
	}
	
char currentLetter;
	

	char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getKeyChar());
		if (e.getKeyChar() == currentLetter) {
			panel.setBackground(Color.GREEN);
			System.out.println("Correct");
		}else {
			panel.setBackground(Color.RED);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
		label.setText("" + currentLetter);
	}
}
