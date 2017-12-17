
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class ProductDAO {

    public ProductDAO() {
    }

    private String dataConnection;

    public boolean addProduct(Product p) throws IOException {
        FileWriter outfile = new FileWriter("Products.txt", true);
        outfile.write(p.getID() + "|" + p.getName() + "|" + p.getType() + "|" + p.getBrand() + "|" + p.getNumOfBuyers() + "|" + 
               p.getNumOfExplorer()+ "|" + p.getPrice() + "|" +  p.getQuantity() + "|" + p.getIsAdded() + "|" + p.getPoints() + "#");
        outfile.close();
        return true;
    }

    public boolean updateProduct(Product product) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("Products.txt"));
        String getData = scanner.useDelimiter("\\Z").next();
        String products[] = getData.split("\\#");
        Product p = new Product();
        for(int i=0; i<products.length; i++){
            String productData[] = products[i].split("\\|");
            if(productData[1].equals(product.getName())){
                productData[7] = String.valueOf((Integer.parseInt(productData[7]) + product.getQuantity()));
                if(Integer.parseInt(productData[7]) < 0){
                    System.out.println("There no enough products.");
                    break;
                }
                String pData = productData[0]+"|"+productData[1]+"|"+productData[2]+"|"+productData[3]+"|"+productData[4]+
                        "|"+productData[5]+"|"+productData[6]+"|"+productData[7]+"|"+productData[8]+"|"+productData[9];
                products[i] = pData;
            }
        }
        scanner.close();
        Formatter outfile = new Formatter(new File("Products.txt"));
        for(int i=0; i<products.length; i++){
            outfile.format("%s#", products[i]);
        }
        outfile.close();
        return true;
    }
    public void increaseExplorers(Product product) throws FileNotFoundException{
        Scanner scanner = new Scanner(new File("Products.txt"));
        String getData = scanner.useDelimiter("\\Z").next();
        String products[] = getData.split("\\#");
        Product p = new Product();
        for(int i=0; i<products.length; i++){
            String productData[] = products[i].split("\\|");
            if(productData[1].equals(product.getName())){
               productData[5] = String.valueOf(Integer.parseInt(productData[5]) + 1);
                System.out.println("-----" + productData[5]);
               String pData = productData[0]+"|"+productData[1]+"|"+productData[2]+"|"+productData[3]+"|"+productData[4]+
                        "|"+productData[5]+"|"+productData[6]+"|"+productData[7] +"|"+ productData[8]+"|"+productData[9];
                products[i] = pData;
            }
        }
        scanner.close();
        Formatter outfile = new Formatter(new File("Products.txt"));
        for(int i=0; i<products.length; i++){
            outfile.format("%s#", products[i]);
        }
        outfile.close();
    }
    public boolean deleteProduct(String pName) throws FileNotFoundException {
        
        return false;
    }

    public Product selectProduct(String pName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("Products.txt"));
        String getData = "";
        if(scanner.hasNext())
            getData = scanner.useDelimiter("\\Z").next();
        else
            return null;
        String products[] = getData.split("\\#");
        Product p = new Product();
        boolean flag = false;
        for(int i=0; i<products.length; i++){
            String productData[] = products[i].split("\\|");
            if(productData[1].equals(pName) && productData[8].equals("true")){
                flag = true;
                p.setID(Integer.parseInt(productData[0]));
                p.setName(productData[1]);
                p.setType(productData[2]);
                p.setBrand(productData[3]);
                p.setNumOfBuyers(Integer.parseInt(productData[4]));
                p.setNumOfExplorer(Integer.parseInt(productData[5]));
                p.setPrice(Float.valueOf(productData[6]));
                p.setQuantity(Integer.parseInt(productData[7]));
                p.setPoints(Integer.parseInt(productData[9]));
                break;
            }
        }
        scanner.close();
        if(flag)
            return p;
        else
            return null;
    }

}