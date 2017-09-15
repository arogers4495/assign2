import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class membersPanel {
	File members = new File("./src/Members.txt");
	Scanner membersScan;

	public membersPanel() throws FileNotFoundException {
		membersScan = new Scanner(members);
		while (membersScan.hasNextLine()) {
			String name = membersScan.nextLine().trim();
			String phone = membersScan.nextLine().trim();
			String eMail = membersScan.nextLine().trim();
			String description = membersScan.nextLine().trim();
			try {
				membersScan.nextLine();
			} catch (java.util.NoSuchElementException e) {// This bit of code deals with blank or empty lines
			}
		}
	}
}
