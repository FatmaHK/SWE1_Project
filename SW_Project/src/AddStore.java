
import java.io.IOException;
import java.util.*;

public class AddStore {

    public AddStore() {
    }

    private String stoeName;
    private String type;
    private String address;
    private String ownerName;
    public void addStore() throws IOException {
        Store s = new Store();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter store name: ");
        s.setName(scanner.next());
        System.out.println("Enter store type: ");
        s.setType(scanner.next());
        if(s.getType().equals("onsite")){
            System.out.println("Enter store address: ");
            s.setAddress(scanner.next());
        }
        s.setOwner(UserController.currentUser.getID());
        StoreController sc = new StoreController();
        sc.addStore(s);
    }

}