package companyInfo;

import javax.swing.JFrame;

public class frame {

	public static void main(String[] args) {
		
		JFrame aFrame = new JFrame("4guys");
		aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel apanel = new panel();
		aFrame.getContentPane().add(apanel);
		aFrame.pack();
		aFrame.setVisible(true);
		
		

	}

}
