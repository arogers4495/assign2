import javax.swing.JFrame;

public class MainFrame {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new membersPanel());

		frame.pack();
		frame.setVisible(true);
	}

}
