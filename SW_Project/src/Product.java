
import java.util.*;

/**
 * 
 */
public class Product {

    /**
     * Default constructor
     */
    public Product() {
        numOfBuyers = 0;
        numOfExplorer = 0;
        points = 0;
    }

    /**
     * 
     */
    private int ID;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private float price;

    /**
     * 
     */
    private String type;

    /**
     * 
     */
    private String brandName;

    /**
     * 
     */
    private int numOfBuyers;

    /**
     * 
     */
    private int numOfExplorer;

    /**
     * 
     */
    private int quantity;
    private int points;

    /**
     * 
     */
    private boolean isAdded;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brandName;
    }

    public void setBrand(String brand) {
        this.brandName = brand;
    }

    public int getNumOfBuyers() {
        return numOfBuyers;
    }

    public void setNumOfBuyers(int numOfBuyers) {
        this.numOfBuyers = numOfBuyers;
    }

    public int getNumOfExplorer() {
        return numOfExplorer;
    }

    public void setNumOfExplorer(int numOfExplorer) {
        this.numOfExplorer = numOfExplorer;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean getIsAdded() {
        return isAdded;
    }

    public void setIsAdded(boolean isAdded) {
        this.isAdded = isAdded;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }







}