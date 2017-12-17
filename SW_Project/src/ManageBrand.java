
import java.io.IOException;
import java.util.Scanner;


public class ManageBrand {
    int ID;
    String Name;
    String companyName;
    public void addBrand() throws IOException {
        Brand b = new Brand();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter brand ID: ");
        b.setID(input.nextInt());
        System.out.println("Enter brand name: ");
        b.setName(input.next());
        System.out.println("Enter company name: ");
        b.setCompanyName(input.next());
        BrandController bc = new BrandController();
        bc.addBrand(b);
    }
    public void updateBrand() {
        
    }
    public void removeBrand() {
        
    }
    public void suggestBrand() {
        
    }
}
