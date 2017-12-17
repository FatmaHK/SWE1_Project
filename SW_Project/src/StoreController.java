
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class StoreController {

    public StoreController() {
    }
    
    public ArrayList<String> getStoreProducts(String sName) throws FileNotFoundException{
        StoreDAO dao = new StoreDAO();
        String storeProducts = dao.getStoreProducts();
        String products[] = storeProducts.split("\\#");
        ArrayList<String> pNames = new ArrayList<String>();
        for(int i=0; i<products.length; i++){
            String pData[] = products[i].split("\\|");
            if(pData[0].equals(sName)){
                pNames.add(pData[1]);
            }
        }
        return pNames;
    }
    public String showStores() throws FileNotFoundException{
        StoreDAO dao = new StoreDAO();
        String stores = dao.getStores();
        return stores;
    }
    public void addProductToStore(String sName, String pName, float pPrice, int pQuantity) throws IOException {
        ProductDAO pDao = new ProductDAO();
        Product product = pDao.selectProduct(pName);
        if(product == null){
            System.out.println("This product doesn't exist.");
            return;
        }
        StoreDAO dao = new StoreDAO();
        dao.addProductToStore(sName, pName, pPrice, pQuantity);
        Product p = new Product();
        p.setName(pName);
        p.setQuantity(-1*pQuantity);
        pDao.updateProduct(p);
    }

    public void addBrandToStore(Brand b) {
        
    }

    public void removeProductFromStore(String pName) {
        
    }

    public void removeBrandFromStore(String bName) {
        
    }

    public void addStore(Store s) throws IOException {
        Store store = getStore(s.getName());
        if(store == null){
            StoreDAO dao = new StoreDAO();
            dao.addStore(s);
        }
        else
            System.out.println("This store is already exist.");
    }

    
    public void updateStoreData(Store s) {
        
    }

    public void removeStore(String sName) {
        
    }

    public Store getStore(String sName) throws FileNotFoundException {
        StoreDAO dao = new StoreDAO();
        Store s = dao.selectStore(sName);
        return s;
    }

    public void increaseProductView(Product p) {
        
    }

    public Product getMostViewedProduct() {
        
        return null;
    }

    public void buyProduct(int userID, int pID) {
        
    }

}