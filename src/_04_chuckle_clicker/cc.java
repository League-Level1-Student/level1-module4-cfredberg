package _04_chuckle_clicker;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class cc implements ActionListener {
	public static void main(String[] args) {
		cc c = new cc();
		c.MakeButtons();
	}
	
	JButton b1 = new JButton("joke");
	JButton b2 = new JButton("punchline");
	
	public void MakeButtons() {
		JFrame frame = new JFrame("Make Buttons");
		JPanel panel = new JPanel();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(100, 80));
		frame.add(panel);
		frame.pack();
		
		panel.add(b1);
		panel.add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == b1) {
			JOptionPane.showMessageDialog(null, "Why did the football team go to the bank?");
		}else {
			JOptionPane.showMessageDialog(null, "To get their quarterback.");
		}
	}
}
