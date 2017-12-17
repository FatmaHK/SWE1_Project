
import java.io.IOException;
import java.util.*;

public class Register {

    public Register() {
    }

    private String name;
    private String email;
    private String password;
    private String comfirmPassword;
    private String type;
    private String phone;

    public void register() throws IOException {
        User u = new User();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        u.setName(input.next());
        System.out.println("Enter your id: ");
        u.setID(input.nextInt());
        System.out.println("Enter your email: ");
        u.setEmail(input.next());
        System.out.println("Enter your password: ");
        u.setPassowrd(input.next());
        System.out.println("Enter your phone: ");
        u.setPhone(input.next());
        System.out.println("Enter your type: ");
        u.setType(input.next());
        UserController uc = new UserController();
        uc.register(u);
    }

}