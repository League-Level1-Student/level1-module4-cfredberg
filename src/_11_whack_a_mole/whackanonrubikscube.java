package _11_whack_a_mole;

import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class whackanonrubikscube implements ActionListener {
	JFrame frame;
	Date start = new Date();
	int moleCount = 0;
	int missCount = 0;
	//24 buttons
	public static void main(String[] args) {
		whackanonrubikscube w = new whackanonrubikscube();
		w.run();
	}
	
	int ran2 = 0;
	
	public void run() {
		if(moleCount == 10) {
			endGame(start, moleCount);
		}else if(missCount == 5) {
			JOptionPane.showMessageDialog(null, "You have lost");
			System.exit(0);
		}
		frame = new JFrame("Whack a Non-Rubik's Cube");
		JPanel panel = new JPanel();
		frame.add(panel);
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension(300, 500));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int ran = new Random().nextInt(24);
		int ran1 = new Random().nextInt(2);
		for (int i = 0; i < 24; i++) {
			JButton b = new JButton("");
			panel.add(b);
			b.addActionListener(this);
			b.setPreferredSize(new Dimension(80, 30));
			if (i == ran) {
				if (ran1 == 0) {
					b.setText("IPhone");
				}else if (ran1 == 1) {
					b.setText("Rubik's Cube");
				}
				ran2 = ran1;
			}
		}
		frame.pack();
	}
	
	private void endGame(Date timeAtStart, int molesWhacked) { 
	    Date timeAtEnd = new Date();
	    JOptionPane.showMessageDialog(null, "Your whack rate is "
	            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	                  + " moles per second.");
	    System.exit(0);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton b1 = (JButton) e.getSource();
		if (b1.getText().equals("") && ran2 == 0) {
			speak("You missed");
			missCount++;
		}else if(b1.getText().equals("") && ran2 == 1) {
			speak("Good Job");
			moleCount++;
			playSound("sound.wav");
		}
		else if (b1.getText().equals("IPhone")) {
			speak("Good job");
			moleCount++;
			playSound("sound.wav");
		}else if (b1.getText().equals("Rubik's Cube")) {
			speak("You missed");
			missCount++;
		}
		
		frame.dispose();
		run();
	}
	
	static void speak(String words) {
        if( System.getProperty( "os.name" ).contains( "Windows" ) ) {
            String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
                    + words + "');\"";
            try {
                Runtime.getRuntime().exec( cmd ).waitFor();
            } catch( Exception e ) {
                e.printStackTrace();
            }
        } else {
            try {
                Runtime.getRuntime().exec( "say " + words ).waitFor();
            } catch( Exception e ) {
                e.printStackTrace();
            }
        }
    }
	
	private void playSound(String fileName) { 
	    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	    sound.play();
	}

}
