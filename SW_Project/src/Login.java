
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Login {

    public Login() {
    }

    private String email;
    private String password;
    
    public void login() throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your email: ");
        String email = input.next();
        System.out.print("Enter your password: ");
        String pass = input.next();
        UserController uc = new UserController();
        uc.login(email, pass);
        UserFunctins uf = new UserFunctins();
        uf.getUserFunctions();
    }
}