import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class membersPanel {
	File members = new File("");
	Scanner membersScan;
	private int numberOfMembers;

	public membersPanel() throws FileNotFoundException {
		membersScan = new Scanner(members);
		String name = membersScan.nextLine();
		String description = membersScan.nextLine();
		numberOfMembers++;// Increments the number of members in the group
	}
}
