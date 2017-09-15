
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ProfilePanel extends JPanel {

	JLabel name = new JLabel();
	JLabel edu = new JLabel();
	JLabel description = new JLabel();
	ImageIcon profilePic = new ImageIcon();
	JButton next = new JButton("Next");
	JButton home = new JButton("Home");

	public ProfilePanel() throws FileNotFoundException {
		int index = 0;
		MembersCollection group = new MembersCollection(); // Initializes the array of group members

		/*
		 * This bit of code selects the appropriate group member based on the user's
		 * selection; I've done this so that it will be easier to cycle through them
		 */
		Member currentMember = group.group[index];

		setPreferredSize(new Dimension(500, 600));
		setLayout(new BorderLayout());
		GridLayout layout = new GridLayout(1, 1);// needs some tinkering
		JPanel grid = new JPanel(layout); // applys grid layout to panel
		// sets labels to members info
		name.setText("");
		edu.setText("");
		description.setText("");

		// grid.add(profilePic);
		grid.add(name);
		grid.add(edu);
		grid.add(description);
		grid.add(next);
		grid.add(home);

		add(grid, BorderLayout.NORTH);

		next.addActionListener(new buttonListener());
		home.addActionListener(new buttonListener());

	}

	class buttonListener implements ActionListener {
		// Actions when a button is pushed
		@Override
		public void actionPerformed(ActionEvent event) {

			if (event.getSource() == next) {

				// changes the index of the members array

				try {

					// if points to a index =!

				} catch (IndexOutOfBoundsException e) {
					// reset to index 0
				}

			}

			if (event.getSource() == home) {

			}

		}

	}
}
