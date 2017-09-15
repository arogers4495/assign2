import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MembersCollection {
	File members = new File("/src/Members.txt");
	Scanner membersScan;
	Member[] group = new Member[4];
	int index;

	public MembersCollection() throws FileNotFoundException {
		index = 0;
		membersScan = new Scanner(members);
		while (membersScan.hasNextLine()) {
			String name = membersScan.nextLine().trim();
			String phone = membersScan.nextLine().trim();
			String eMail = membersScan.nextLine().trim();
			String description = membersScan.nextLine().trim();
			Member newMember = new Member(name, phone, eMail, description);
			group[index] = newMember;
			index++;
			try {
				membersScan.nextLine();
			} 
			catch (java.util.NoSuchElementException e) {// This bit of code deals with blank or empty lines
			}
		}
	}
}
