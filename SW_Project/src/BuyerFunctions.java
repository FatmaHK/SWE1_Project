
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class BuyerFunctions {
    public BuyerFunctions() {
    }

    private ArrayList<Store> stores;

    public void visitStore() throws FileNotFoundException, IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name of store to visit: ");
        String storeName = input.next();
        BuyProduct bp = new BuyProduct();
        bp.showStoreProducts(storeName);
    }
    
    public void showStores() throws FileNotFoundException, IOException{
        StoreController sc = new StoreController();
        String storesData = sc.showStores();
        String stores[] = storesData.split("\\#");
        System.out.println("Platform stores:");
        for (int i = 0; i <stores.length; i++) {
            String s[] = stores[i].split("\\|");
            System.out.println((i+1) + ") " + s[0]);
        }
        visitStore();
    }
}