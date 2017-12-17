
import java.io.FileNotFoundException;
import java.util.*;

public class GetStatistics {

    public GetStatistics() {
    }
    
    private String storeName;
    public void getStatistics(String sName) throws FileNotFoundException{
        System.out.println("1) Get number of explorers for each product:\n2) Get most viewed product in the store:\nEnter option number: ");
        Scanner input = new Scanner(System.in);
        int optNum = input.nextInt();
        if(optNum == 1)
            getNumOfExplorersForEachProduct(sName);
        else if(optNum == 2)
            getMostExploredProduct(sName);
        else
            return;
    }
    public void getNumOfExplorersForEachProduct(String sName) throws FileNotFoundException{
        StoreController sc = new StoreController();
        ArrayList<String> sProducts = sc.getStoreProducts(sName);
        ProductController pc =new ProductController();
        for(int i=0; i<sProducts.size(); i++){
            Product p = pc.searchForProduct(sProducts.get(i));
            System.out.println(p.getName() + ": number of explorers = " + p.getNumOfExplorer());
        }
    }
    public void getMostOrderedProducts() {
        
    }

    public void getMostExploredProduct(String sName) throws FileNotFoundException {
        StoreController sc = new StoreController();
        ArrayList<String> sProducts = sc.getStoreProducts(sName);
        ProductController pc =new ProductController();
        int maxViews = 0;
        Product maxProduct = null;
        for(int i=0; i<sProducts.size(); i++){
            Product p = pc.searchForProduct(sProducts.get(i));
            if(p == null){
                continue;
            }
            if(p.getNumOfExplorer() > maxViews){
                maxViews = p.getNumOfExplorer();
                maxProduct = p;
            }
        }
        System.out.println(maxProduct.getName() + ": number of explorers = " + maxProduct.getNumOfExplorer());
    }

}