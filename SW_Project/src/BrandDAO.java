
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class BrandDAO {

    public BrandDAO() {
    }

    private String dataConnection;

    public boolean addBrand(Brand b) throws IOException {
        FileWriter outfile = new FileWriter("Brands.txt", true);
        outfile.write(b.getID() + "|" + b.getName() + "|" + b.getCompanyName() + "#");
        outfile.close();
        return true;
    }

    public boolean updateBrand(Brand b) {
        // TODO implement here
        return false;
    }

    public boolean deleteBrand(String bName) {
        // TODO implement here
        return false;
    }

    public Brand selectBrand(String bName) throws FileNotFoundException, IOException {
        File f = new File("Brands.txt");
        Scanner scanner;
        if(f.exists())
            scanner = new Scanner(f);
        else{
            f.createNewFile();
            scanner = new Scanner(f);
        }
        String getData = "";
        if(scanner.hasNext())
            getData = scanner.useDelimiter("\\Z").next();
        else
            return null;
        String brands[] = getData.split("\\#");
        Brand b = new Brand();
        boolean flag = false;
        for(int i=0; i<brands.length; i++){
            String brandData[] = brands[i].split("\\|");
            if(brandData[1].equals(bName)){
                flag = true;
                b.setID(Integer.parseInt(brandData[0]));
                b.setName(brandData[1]);
                b.setCompanyName(brandData[2]);
            }
        }
        scanner.close();
        if(flag)
            return b;
        else
            return null;
    }

}