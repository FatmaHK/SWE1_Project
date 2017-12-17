
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        //firstView();
        Login login = new Login();
        login.login();
        ManageProduct mp = new ManageProduct();
        mp.addProduct();
    }
    public static void firstView() throws FileNotFoundException, IOException{
        System.out.println("1)Sign in.\n2)sign up.");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter option number: ");
        int option = input.nextInt();
        if(option == 1){
            Login login = new Login();
            login.login();
        }
        else{
            Register regist = new Register();
            regist.register();
        }
    }
}
