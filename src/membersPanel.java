import java.awt.Container;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MembersPanel extends JPanel {

    List<JButton> buttonList = new ArrayList<JButton>();
    ArrayList<Member> staffMember = new ArrayList<Member>();
    Member staff;

    @SuppressWarnings({ "resource" })
    public MembersPanel() {

        Container buttonLayout = new Container();


        File myFile = new File("./src/Members"); // file of members

        Scanner scan = null;
        try {
            scan = new Scanner(myFile); // scans file
        } catch (FileNotFoundException e) {

            e.fillInStackTrace();
        }

            while(scan.hasNextLine()){ // while file has a next line

            String word = scan.nextLine();

            Scanner myLineScanner = new Scanner(word);

            myLineScanner.useDelimiter("\\n");

            while(myLineScanner.hasNext()){  //

                String name = myLineScanner.nextLine(); // gets name

                String phoneNum = myLineScanner.nextLine(); // NoSuchElementException
                                                            // Not sure why,  should just go to next line
                String email = myLineScanner.nextLine();

                String about = myLineScanner.nextLine();

                System.out.println(name + phoneNum + email + about);// debug make sure we get all values


                staff = new Member(name, phoneNum, email, about); //creates member out of values



                staffMember.add(staff); // adds member to staffMember ArrayList

            }
        }
            //creates buttons depending on the number of members with there name on the button
           for(int i = 1; i <= staffMember.size(); i++) {

               JButton staffButton = new JButton(staffMember.get(i).getName());

               buttonList.add(staffButton);
               buttonLayout.add(staffButton);
           }

           add(buttonLayout);
    }

}
