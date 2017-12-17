
import java.io.IOException;
import java.util.*;

public class ManageProduct {

    public ManageProduct() {
    }

    private String pID;
    private String pName;
    private String pType;
    private String brandName;
    private float pPrice;
    
    public void addProduct() throws IOException {
        Product p = new Product();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter product ID: ");
        p.setID(input.nextInt());
        System.out.println("Enter product name: ");
        p.setName(input.next());
        System.out.println("Enter product brand: ");
        p.setBrand(input.next());
        System.out.println("Enter product price: ");
        p.setPrice(input.nextFloat());
        System.out.println("Enter product quantity: ");
        p.setQuantity(input.nextInt());
        System.out.println("Enter product type: ");
        p.setType(input.next());
        if(UserController.currentUser.getType().equals("admin")){
            System.out.println("Do you want to add points to this product? (y/n)");
            char c = input.next().charAt(0);
            if(c =='y'){
                int points = provideVoucherCard();
                p.setPoints(points);
            }
            p.setIsAdded(true);
        }
        else
            p.setIsAdded(false);
        ProductController pc = new ProductController();
        pc.addProduct(p);
    }
    
    public int provideVoucherCard(){
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter prduct points: ");
        int points = input.nextInt();
        return points;
    }
    public void updateProduct() {
        
    }
    public void removeProduct() {
        
    }
    public void suggestProduct() {
        
    }

}