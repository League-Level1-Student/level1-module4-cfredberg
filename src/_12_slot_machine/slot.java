package _12_slot_machine;

import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.*;

public class slot implements ActionListener {
	public static void main(String[] args) {
		slot s = new slot();
		s.code();
	}

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton("Spin");
	JLabel pic1 = new JLabel();
	JLabel pic2 = new JLabel();
	JLabel pic3 = new JLabel();
	int num1 = 0;
	int num2 = 0;
	int num3 = 0;
	int wins = 0;
	JLabel winCounter = new JLabel("Wins: " + wins);
	
	private void code() {
		// TODO Auto-generated method stub
		frame.add(panel);
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension(1000, 600));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		
		panel.add(button);
		panel.add(winCounter);
		
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		num1 = new Random().nextInt(3);
		num2 = new Random().nextInt(3);
		num3 = new Random().nextInt(3);
		if (num1 == 0) {
			try {
				pic1 = image("cpu1.jpg");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}else if (num1 == 1) {
			try {
				pic1 = image("cpu2.jpg");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}else if (num1 == 2) {
			try {
				pic1 = image("cpu3.jpg");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		if (num2 == 0) {
			try {
				pic2 = image("cpu1.jpg");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}else if (num2 == 1) {
			try {
				pic2 = image("cpu2.jpg");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}else if (num2 == 2) {
			try {
				pic2 = image("cpu3.jpg");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		if (num3 == 0) {
			try {
				pic3 = image("cpu1.jpg");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}else if (num3 == 1) {
			try {
				pic3 = image("cpu2.jpg");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}else if (num3 == 2) {
			try {
				pic3 = image("cpu3.jpg");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		panel.removeAll();
		panel.add(button);
		panel.add(pic1);
		panel.add(pic2);
		panel.add(pic3);
		panel.add(winCounter);
		frame.pack();
		if (num1 == num2 && num2 == num3) {
			playSound("win.wav");
			JOptionPane.showMessageDialog(null, "You Win!");
			wins++;
			winCounter.setText("Wins: " + wins);
			frame.pack();
		}
	}
	
	private JLabel image(String fileName) throws MalformedURLException{
        URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return new JLabel();
	}
	Icon icon = new ImageIcon(imageURL);
	JLabel imageLabel = new JLabel(icon);
	return imageLabel;
}
	
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	     sound.play();
	}



}
