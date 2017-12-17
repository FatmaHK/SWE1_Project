
import java.io.IOException;
import java.util.*;

/**
 * 
 */
public class AddProductToStore {

    /**
     * Default constructor
     */
    public AddProductToStore() {
    }

    /**
     * 
     */
    private String storeName;

    /**
     * 
     */
    private String prductName;
    public void addToStore() throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Store name: ");
        String sName = input.next();
        System.out.println("Enter product name: ");
        String pName = input.next();
        System.out.println("Enter product price: ");
        float pPrice = input.nextFloat();
        System.out.println("Enter product quantity: ");
        int pQ = input.nextInt();
        StoreController sc = new StoreController();
        sc.addProductToStore(sName, pName, pPrice, pQ);
    }

}