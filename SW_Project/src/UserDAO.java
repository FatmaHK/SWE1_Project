
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class UserDAO {

    public UserDAO() {
    }

    public boolean addUser(User u) throws FileNotFoundException, IOException {
        FileWriter outfile = new FileWriter("Users.txt", true);
        outfile.write(u.getID() + "|" + u.getName()+ "|" + u.getEmail()+ "|" + u.getPhone()+ "|" + u.getType()+ "|" + u.getPassowrd() + "#");
        outfile.close();
        return true;
    }

    public User selectUser(String email, String pass) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("Users.txt"));
        String getData = scanner.useDelimiter("\\Z").next();
        String users[] = getData.split("\\#");
        User curr = null;
        for(int i=0; i<users.length; i++){
            String userData[] = users[i].split("\\|");
            if(userData[2].equals(email) && userData[5].equals(pass)){
                curr = new User();
                curr.setID(Integer.parseInt(userData[0]));
                curr.setName(userData[1]);
                curr.setEmail(userData[2]);
                curr.setPhone(userData[3]);
                curr.setType(userData[4]);
                curr.setPassowrd(userData[5]);
            }
        }
        scanner.close();
        return curr;
    }
    public void updateUser(User u) throws FileNotFoundException{
        Scanner scanner = new Scanner(new File("Users.txt"));
        String getData = scanner.useDelimiter("\\Z").next();
        String users[] = getData.split("\\#");
        User user = new User();
        for(int i=0; i<users.length; i++){
            String userData[] = users[i].split("\\|");
            if(userData[0].equals(u.getID())){
                userData[6] = String.valueOf(u.getPoints());
                String uData = userData[0]+"|"+userData[1]+"|"+userData[2]+"|"+userData[3]+"|"+userData[4]+
                        "|"+userData[5]+"|"+userData[6];
                users[i] = uData;
            }
        }
        scanner.close();
        Formatter outfile = new Formatter(new File("Users.txt"));
        for(int i=0; i<users.length; i++){
            outfile.format("%s#", users[i]);
        }
        outfile.close();
    }

}