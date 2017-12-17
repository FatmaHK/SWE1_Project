
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class ProductController {

    public ProductController() {
    }

    public void addProduct(Product p) throws IOException {
        ProductDAO dao = new ProductDAO();
        Product product = dao.selectProduct(p.getName());
        if(product == null){
            dao.addProduct(p);
        }
        else{
            dao.updateProduct(p);
        }
        
    }

    public void removeProduct(String pName) {
        
    }

    public Product searchForProduct(String pName) throws FileNotFoundException {
        ProductDAO dao = new ProductDAO();
        Product p = dao.selectProduct(pName);
        return p;
    }

    public void updateProduct(Product p) {
        
    }

    public Product getMostOrderedProduct() {
        // TODO implement here
        return null;
    }

    public void checkSuggestedProducts() {
        
    }

}