
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class BuyProduct {

    public BuyProduct() {
    }

    private String pName;

    private String methodOfPayment;

    public void buy(String storeName) throws FileNotFoundException, IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter product name: ");
        String pName = input.next();
        System.out.println("Select the method of payment (by voucher, in cash or by credit):");
        methodOfPayment = input.nextLine();
        if(methodOfPayment.equals("by voucher")){
            Payment pay = new Payment();
            pay.setBuyerName(UserController.currentUser.getName());
            pay.setPaymentMethod(methodOfPayment);
            pay.setProductName(pName);
            ProductController pc = new ProductController();
            Product p = pc.searchForProduct(pName);
            if(p == null)
                return;
            pay.PayByVoucher(p.getPrice());
            StoreDAO dao = new StoreDAO();
            dao.buyProduct(UserController.currentUser.getID(), p.getID(), storeName);
            
        }
    }
    public void exploreProduct() throws FileNotFoundException{
        Scanner input = new Scanner(System.in);
        System.out.println("Enter product name: ");
        String pName = input.next();
        ProductController pc = new ProductController();
        Product p = pc.searchForProduct(pName);
        if(p == null)
            return;
        System.out.println("Product ID: " + p.getID());
        System.out.println("Product name: " + p.getName());
        System.out.println("Product brand: " + p.getBrand());
        System.out.println("Product price: " + p.getPrice());
        System.out.println("Product quantity: " + p.getQuantity());
        System.out.println("Product type: " + p.getType());
        System.out.println("Number of buyers: " + p.getNumOfBuyers());
        System.out.println("Number of explorers: " + p.getNumOfExplorer());
        if(UserController.currentUser.getType().equals("buyer")){
            ProductDAO dao = new ProductDAO();
            dao.increaseExplorers(p);
        }
            
    }
    public void showStoreProducts(String storeName) throws FileNotFoundException, IOException{
        StoreController sc = new StoreController();
        ArrayList<String> storeProducts = sc.getStoreProducts(storeName);
        if(storeProducts.size() == 0){
            System.out.println("This store is empty.");
            return;
        }
        System.out.println(storeName + " products: ");
        for(int i=0; i<storeProducts.size(); i++){
            System.out.print(storeProducts.get(i) + " ");
        }
        System.out.println("\n1) Buy Product\n2) Explore Product\n3) Logout");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter option number: ");
        int optNum = input.nextInt();
        if(optNum == 1)
            buy(storeName);
        else if(optNum == 2)
            exploreProduct();
        else if(optNum == 3){
            UserController uc = new UserController();
            uc.logOut();
        }
    }
}