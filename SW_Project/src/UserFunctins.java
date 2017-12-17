
public class UserFunctins {
    public void getUserFunctions(){
        String userType = UserController.currentUser.getType();
        if(userType.equals("admin")){
            System.out.println("1)Add product to the system.\n2)Add brand to the system." +
                    "3)Explore products in store.\n4)View specific product details.");
        }
        else if(userType.equals("storeowner")){
            System.out.println("1)Add store.\n2)Add product to store." +
                    "3)Explore products in store.\n4)View specific product details.\n5)Get statistics of a store.");
        }
        else if(userType.equals("buyer")){
            System.out.println("");
        }
    }
}
