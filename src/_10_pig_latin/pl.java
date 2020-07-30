package _10_pig_latin;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class pl implements ActionListener {
	public static void main(String[] args) {
		pl p = new pl();
		p.code();
	}
	
	JFrame frame = new JFrame("Pig Latin");
	JPanel panel = new JPanel();
	JTextField t = new JTextField();
	JTextField t1 = new JTextField();
	JButton b = new JButton("Translate");
	PigLatinTranslator plt = new PigLatinTranslator();
	
	public void code() {
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension(700, 100));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.pack();
		
		panel.add(t);
		panel.add(b);
		panel.add(t1);
		
		t.setPreferredSize(new Dimension(200, 30));
		t1.setPreferredSize(new Dimension(200, 30));
		
		b.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		t1.setText(plt.translate(t.getText()));
	}
}