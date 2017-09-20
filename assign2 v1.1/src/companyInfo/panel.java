package companyInfo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class panel extends JPanel {
	
	ImageIcon base, ali, auston, josh, seth;
	JButton Ali, Auston, Josh, Seth;
	JLabel img;
	JTextArea caption;
	
	info myinfo = new info();
	
	public panel() {
		
		//background setting
		setPreferredSize(new Dimension(640,400));
		setBackground(Color.WHITE);
		
		//setting img(path)
		base = new ImageIcon("./src/companyInfo/base.png");
		ali = new ImageIcon("./src/companyInfo/ali.jpg");
		auston = new ImageIcon("./src/companyInfo/auston.jpg");
		josh = new ImageIcon("./src/companyInfo/josh.jpg");
		seth = new ImageIcon("./src/companyInfo/seth.jpg");
		
		//Label
		caption = new JTextArea("Choose a person");
		
		//Label img
		img = new JLabel(base);
		
		//Button
		Ali = new JButton ("Ali");
		Ali.addActionListener(new buttonListener());
		
		Auston = new JButton ("Auston");
		Auston.addActionListener(new buttonListener());
		
		Josh = new JButton ("Josh");
		Josh.addActionListener(new buttonListener());
		
		Seth = new JButton ("Seth");
		Seth.addActionListener(new buttonListener());
		
		//layout for placing postion
		this.setLayout(new BorderLayout());
		JPanel buttonPanel = new JPanel();
		
		//adding 
		buttonPanel.add(img);
		this.add(buttonPanel, BorderLayout.NORTH);
		add(caption);
		
		buttonPanel.add(Ali);
		this.add(buttonPanel, BorderLayout.SOUTH);
		buttonPanel.add(Auston);
		this.add(buttonPanel, BorderLayout.SOUTH);
		buttonPanel.add(Josh);
		this.add(buttonPanel, BorderLayout.SOUTH);
		buttonPanel.add(Seth);
		this.add(buttonPanel, BorderLayout.SOUTH);
		
	}
	private class buttonListener implements ActionListener {
	
		public void actionPerformed(ActionEvent arg0) {
			
			if(arg0.getSource()== Ali) {
				img.setIcon(ali);
				caption.setText(myinfo.getAli());
			}
			
			if(arg0.getSource()== Auston) {
				img.setIcon(auston);
				caption.setText(myinfo.getAuston());
			}
			
			if(arg0.getSource()== Josh) {
				img.setIcon(josh);
				caption.setText(myinfo.getJosh());
			}
			
			if(arg0.getSource()== Seth) {
				img.setIcon(seth);
				caption.setText(myinfo.getSeth());
			}
			
			
			
		}
		
	}

}
