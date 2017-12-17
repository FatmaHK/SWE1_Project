
import java.io.IOException;
import java.util.*;


public class BrandController {

    public BrandController() {
    }

    public void addBrand(Brand b) throws IOException {
       BrandDAO dao = new BrandDAO();
        Brand brand = dao.selectBrand(b.getName());
        if(brand == null){
            dao.addBrand(b);
        }
        else{
            System.out.println("This brand already exists.");
        }
    }
    public void removeBrand(String bName) {
        
    }

    public void addSuggestBrand(Brand b) {
        
    }

    public Brand searchForBrand(String bName) {
        // TODO implement here
        return null;
    }

    public void updateBrand(Brand p) {
        
    }
    public Brand getMostOrderedBrand() {
        // TODO implement here
        return null;
    }
    public void checkSuggestedBrands() {
        
    }

}