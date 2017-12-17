
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserController {

    public UserController() {
    }

    public static User currentUser;

    public void register(User u) throws IOException {
        currentUser = u;
        UserDAO db = new UserDAO();
        try {
            db.addUser(u);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public boolean login(String email, String pass) throws FileNotFoundException {
        UserDAO db = new UserDAO();
        User u = db.selectUser(email, pass);
        if(u == null){
            System.out.println("Wrong email or password.");
        }
        currentUser = u;
        return true;
    }

    public void logOut() throws IOException {
        currentUser = null;
        Main.firstView();
    }

}