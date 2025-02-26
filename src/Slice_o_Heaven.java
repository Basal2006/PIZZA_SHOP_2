
import java.util.Scanner;

class Slice_o_Heaven 
{
    String storeName;
    String storeAddress;
    String storeEmail;
    String storePhone;
    String[] storeMenu;
    String[] pizzaIngredients;
    double pizzaPrice;
    String[] sides;
    String[] drinks;
    private String orderID;
    private double orderTotal;
    public static final String DEF_ORDER_ID = "DEF-SOH-099";
    public static final String DEF_PIZZA_INGREDIENTS = "Mozzarella Cheese";
    public static final double DEF_ORDER_TOTAL = 15.00;

    public Slice_o_Heaven() 
    {
        this.orderID = DEF_ORDER_ID;
        this.pizzaIngredients = new String[]{DEF_PIZZA_INGREDIENTS};
        this.orderTotal = DEF_ORDER_TOTAL;
        this.sides = new String[]{};
        this.drinks = new String[]{};
    }

    public Slice_o_Heaven(String orderID, String[] pizzaIngredients, double orderTotal) 
    {
        this.orderID = orderID;
        this.pizzaIngredients = pizzaIngredients;
        this.orderTotal = orderTotal;
    }

    public Slice_o_Heaven(String storeName, String storeAddress, String storeEmail, String storePhone,
                          String[] storeMenu, String[] pizzaIngredients, double pizzaPrice,
                          String[] sides, String[] drinks) 
    {
        this.storeName = storeName;
        this.storeAddress = storeAddress;
        this.storeEmail = storeEmail;
        this.storePhone = storePhone;
        this.storeMenu = storeMenu;
        this.pizzaIngredients = pizzaIngredients;
        this.pizzaPrice = pizzaPrice;
        this.sides = sides;
        this.drinks = drinks;
        this.orderID = DEF_ORDER_ID;
        this.orderTotal = DEF_ORDER_TOTAL;
    }

    public void takeOrder() 
    {
        
        this.orderID = "NEW-" + System.currentTimeMillis();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("How many pizzas do you want?");
            int numPizzas = scanner.nextInt();
            this.orderTotal += numPizzas * pizzaPrice;
        }
    }

    public void makePizza() 
    {
        System.out.println("The following ingredients are being used to make pizza: ");
        for (String ingredient : pizzaIngredients) {
            System.out.print(ingredient + " ");
        }
        System.out.println();
    }

    public String getOrderID() 
    {
        return orderID;
    }

    public void setOrderID(String orderID) 
    {
        this.orderID = orderID;
    }

    public double getOrderTotal() 
    {
        return orderTotal;
    }

    public void setOrderTotal(double orderTotal)
    {
        this.orderTotal = orderTotal;
    }

    void printReceipt() 
    {
        System.out.println("Store name: " + storeName);
        System.out.println("Store address: " + storeAddress);
        System.out.println("Order ID: " + orderID);
        System.out.println("order total: $" + orderTotal);
    }

    public void showReceipt() 
    {
        printReceipt();
    }
}