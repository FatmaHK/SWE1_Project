
import java.io.FileNotFoundException;
import java.util.*;

public class StoreOwnerFunctions {

    public StoreOwnerFunctions() {
    }

    public ArrayList<Store> stores;

    public void addStore() {
        
    }

    public void getStatisticsOfAStore() throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter store name");
        String sname = input.next();
        GetStatistics gs = new GetStatistics();
        gs.getStatistics(sname);
    }

    public void addProductToStore() {
        
    }

    public void suggestProduct() {
        
    }

    public void suggestBrand() {
        
    }

    public void showProductDetails() {
        
    }

    public void showStoreProducts() {
        
    }

}