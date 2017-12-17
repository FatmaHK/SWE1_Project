
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class StoreDAO {

    public StoreDAO() {
    }
    public String getStoreProducts() throws FileNotFoundException{
        Scanner scanner = new Scanner(new File("Store Products.txt"));
        String getData = scanner.useDelimiter("\\Z").next();
        return getData;
    }
    public String getStores() throws FileNotFoundException{
        Scanner scanner = new Scanner(new File("Stores.txt"));
        String getData = scanner.useDelimiter("\\Z").next();
        return getData;
    }
    public boolean addStore(Store s) throws IOException {
        FileWriter outfile = new FileWriter("Stores.txt", true);
        outfile.write(s.getName() + "|" + s.getType() + "|" + s.getAddress() + "|" + s.getOwner() + "#");
        outfile.close();
        return true;
    }

    public boolean updateStore(Store s) {
        // TODO implement here
        return false;
    }

    public boolean deleteStore(String sName) {
        return false;
    }

    public Store selectStore(String sName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("Stores.txt"));
        String getData = scanner.useDelimiter("\\Z").next();
        String stores[] = getData.split("\\#");
        Store s = new Store();
        boolean flag = false;
        for(int i=0; i<stores.length; i++){
            String storeData[] = stores[i].split("\\|");
            if(storeData[0].equals(sName)){
                flag = true;
                s.setName(storeData[0]);
                s.setType(storeData[1]);
                s.setAddress(storeData[2]);
                s.setOwner(Integer.parseInt(storeData[3]));
            }
        }
        scanner.close();
        if(flag)
            return s;
        else
            return null;
    }

    public void addProductToStore(String s, String p, float price, int quantity) throws IOException {
        FileWriter outfile = new FileWriter("Store Products.txt", true);
        outfile.write(s + "|" + p + "|" + price + "|" + quantity + "#");
        outfile.close();
    }

    public void buyProduct(int userID, int pID, String sName) throws IOException {
        FileWriter outfile = new FileWriter("Salles.txt", true);
        outfile.write(userID + "|" + pID + "|" + sName + "#");
        outfile.close();
    }
    public Product getMostViewedProduct() {
        // TODO implement here
        return null;
    }
    
    public void updateQuantityInStore(String sName, String pName){
        
    }

}