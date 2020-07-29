package _08_calculator;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class runner implements ActionListener {
	public static void main(String[] args) {
		runner run = new runner();
		run.code();
	}
	
	calc c = new calc();
	JFrame frame = new JFrame("Calculator");
	JPanel panel = new JPanel();
	JTextField num1 = new JTextField();
	JTextField num2 = new JTextField();
	JButton add = new JButton("add");
	JButton sub = new JButton("sub");
	JButton mul = new JButton("mul");
	JButton div = new JButton("div");
	JLabel ans = new JLabel();
	
	public void code() {
		frame.add(panel);
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension(250, 150));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel.add(num1);
		panel.add(num2);
		panel.add(add);
		panel.add(sub);
		panel.add(mul);
		panel.add(div);
		panel.add(ans);
		
		num1.setPreferredSize(new Dimension(100, 30));
		num2.setPreferredSize(new Dimension(100, 30));
		frame.pack();
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == add) {
			ans.setText("" + c.add(Integer.parseInt(num1.getText()), Integer.parseInt(num2.getText())));
		}
		
		if (e.getSource() == sub) {
			ans.setText("" + c.sub(Integer.parseInt(num1.getText()), Integer.parseInt(num2.getText())));
		}
		
		if (e.getSource() == mul) {
			ans.setText("" + c.mul(Integer.parseInt(num1.getText()), Integer.parseInt(num2.getText())));
		}
		
		if (e.getSource() == div) {
			ans.setText("" + c.div(Integer.parseInt(num1.getText()), Integer.parseInt(num2.getText())));
		}
	}
}
