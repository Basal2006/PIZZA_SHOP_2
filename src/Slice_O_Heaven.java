
import java.util.Scanner;
public class Slice_O_Heaven 
{
   public String storeName ;
   public String storeAddress ;
   public String storeEmail;
   public String storePhone;
   public String[] storeMenu;
   public String pizzaIngredients;
   public  double[] pizzaPrices;
   public double[] Drinksprices;
    enum Size {SMALL, MEDIUM, LARGE};
    public String[] Drinks;
    private String OrderID;
    private double OrderTotal;
    final String  DEF_ORDER_ID =  "DEF-SOH-099" ;
    final String  DEF_PIZZA_INGREDIENTS="Mozzarella Cheese";
    final double DEF_ORDER_TOTAL = 15.00;
    private String Orderpizza;
    private String orderDrinks;
    private String orderPizzaIngredients;
    private String orderSize;

    public Slice_O_Heaven()
    {
        storeName = "Slice O Heaven";
        storeAddress = "1234 Pizza Lane";
        storeEmail = "15895227103@163.com";
        storePhone = "123-456-7890";
        storeMenu = new String[]{"Cheese Pizza", "Pepperoni Pizza", "Veggie Pizza", "Meat Lovers Pizza"};
        pizzaIngredients = DEF_PIZZA_INGREDIENTS;
        OrderID = DEF_ORDER_ID;
        OrderTotal = DEF_ORDER_TOTAL;
        pizzaPrices = new double[]{10.00, 12.00, 15.00, 18.00};
        Drinks = new String[]{"Coke", "Pepsi", "Sprite", "Root Beer"};
        Drinksprices = new double[]{1.00, 1.00, 1.00, 1.00};
    }
    public void displayMenu()
    {
        System.out.println("********MENU********");
        for(int i = 0; i < storeMenu.length; i++)
        {
            System.out.println(storeMenu[i] + " $" + pizzaPrices[i]);
        }
        for(int i = 0; i < Drinks.length; i++)
        {
            System.out.println(Drinks[i]+ " $" + Drinksprices[i]);
        }
    }
    public String getOrderpizza()
    {
        return Orderpizza;
    }
    public void setOrderpizza(String order) {
        this.Orderpizza = order;
    }
    
    public String getorderPizzaIngredients() {
        return orderPizzaIngredients;
    }
    public void setorderPizzaIngredients(String orderPizzaIngredients) {
        this.orderPizzaIngredients = orderPizzaIngredients;
    }
    public String getorderDrinks() {
        return orderDrinks;
    }
    public void setorderDrinks(String orderDrinks) {
        this.orderDrinks = orderDrinks;
    }
    public String getOrderSize() {
        return orderSize;
    }
    public void setOrderSize(String orderSize) {
        this.orderSize = orderSize;
    }
    public String getOrderID() {
        return OrderID;
    }
    public void setOrderID(String orderID) {
        this.OrderID = orderID;
    }
    public double getOrderTotal() {
        return OrderTotal;
    }
    public void setOrderTotal(double orderTotal) {
        this.OrderTotal = orderTotal;
    }
    public void choosePizza()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose a pizza: ");
        String choice = input.nextLine();
        setOrderpizza(choice);
        System.out.println("You chose: " + getOrderpizza());
        input.close();
    }
    public void chooseSize()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose a size: ");
        String choice = input.nextLine();
        setOrderSize(choice);
        System.out.println("You chose: " + getOrderSize());
        input.close();
    }
    public void chooseDrink()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose a drink: ");
        String choice = input.nextLine();
        setorderDrinks(choice);;
        System.out.println("You chose: " + getorderDrinks());
        input.close();
    }
    public void choosePizzaIngredients()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose PizzaIngredients: ");
        String choice = input.nextLine();
        setorderPizzaIngredients(choice);
        System.out.println("You chose: " + getorderPizzaIngredients());
        input.close();
    }
    public double calculateTotal()
    {
        double total = 0;
        for(int i = 0; i < storeMenu.length; i++)
        {
            if(getOrderpizza().equals(storeMenu[i]))
            {
                total += pizzaPrices[i];
            }
        }
        for(int i = 0; i < Drinks.length; i++)
        {
            if(getorderDrinks().equals(Drinks[i]))
            {
                total += Drinksprices[i];
            }
        }
        return total;
    }
    public void takeOrder()
    {
        System.out.println("Order accepted!");
        System.out.println("Order is being prepared");
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e){
            System.out.println("Order is ready for pickup!");
        }
        System.out.println("Your order is ready!");
        printReceipt();
    }
    public void makePizza()
    {
        System.out.println("Pizza made");
    }
    public void printReceipt()
    {
        OrderTotal=calculateTotal();
        System.out.println("********RECEIPT********");
        System.out.println("Order ID: " + OrderID);
        System.out.println("Order Total: " + OrderTotal);
    }
}