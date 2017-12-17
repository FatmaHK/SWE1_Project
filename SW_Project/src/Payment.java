
import java.io.FileNotFoundException;
import java.util.*;

/**
 * 
 */
public class Payment {

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Payment() {
    }

    private String productName;

    private String buyerName;

    private String paymentMethod;

    public void PayByVoucher(float price) throws FileNotFoundException {
        float neededPoints = price / 5;
        if(UserController.currentUser.getPoints() < neededPoints){
            System.out.println("You do not have enough points.");
            return;
        }
        else{
            UserController.currentUser.setPoints(UserController.currentUser.getPoints() - (int)neededPoints);
            UserDAO dao = new UserDAO();
            dao.updateUser(UserController.currentUser);
        }
    }

}