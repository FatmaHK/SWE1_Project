/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileNotFoundException;
import java.io.IOException;
import org.junit.Test;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

/**
 *
 * @author Fatma Hussein
 */
public class NewEmptyTestNGTest {
    
    public NewEmptyTestNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    

    public void testLogin() throws FileNotFoundException{
        Login login = new Login();
        login.login();
        System.out.println("CurrentUser: Name=>" + UserController.currentUser.getName() + ", Type=>" + UserController.currentUser.getType());
    }
    
    public void testRegisteration() throws IOException{
        Register register = new Register();
        register.register();
    }
    
    public void testAddProductToStore() throws IOException{
        Login login = new Login();
        login.login();
        System.out.println("addToStore");
        AddProductToStore instance = new AddProductToStore();
        instance.addToStore();
    }
    
    public void testAddStore() throws IOException{
        Login login = new Login();
        login.login();
        AddStore adds = new AddStore();
        adds.addStore();
        StoreDAO dao = new StoreDAO();
        System.out.println(dao.getStores());
    }
  
    public void testAddProductToSestem() throws IOException{
        Login login = new Login();
        login.login();
        ManageProduct mp = new ManageProduct();
        mp.addProduct();
    }
    
    public void testAddBrandToSystem() throws FileNotFoundException, IOException{
        Login login = new Login();
        login.login();
        ManageBrand mg = new ManageBrand();
        mg.addBrand();
    }
    
    public void testSuggestStore() throws FileNotFoundException, IOException{
        Login login = new Login();
        login.login();
        ManageProduct mp = new ManageProduct();
        mp.addProduct();
    }
    
    public void testExploreProductsInStore() throws FileNotFoundException, IOException{
        BuyerFunctions bf = new BuyerFunctions();
        bf.showStores();
    }
    
    public void viewProductDetailsInStore() throws FileNotFoundException{
        Login login = new Login();
        login.login();
        BuyProduct bP = new BuyProduct();
        bP.exploreProduct();
    }
    
    public void testGetNumOfExplorersForEachProductInStore() throws FileNotFoundException{
        GetStatistics gs = new GetStatistics();
        gs.getNumOfExplorersForEachProduct("s1");
    }
    
    @Test
    public void testGetMostViewedProductInStore() throws FileNotFoundException{
        GetStatistics gs = new GetStatistics();
        gs.getMostExploredProduct("s1");
    }
    
}
