import java.util.Scanner;
public class Slice_O_Heaven 
{
   private Scanner input;
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
    private double orderTotal;
    final String  DEF_ORDER_ID =  "DEF-SOH-099" ;
    final String  DEF_PIZZA_INGREDIENTS="Mozzarella Cheese";
    final double DEF_ORDER_TOTAL = 15.00;
    private String Orderpizza;
    private String orderDrinks;
    private String orderPizzaIngredients;
    private String orderSize;
    public String pizzaOfTheDay;
    public String sideOfTheDay; 
    public String specialPrice;
   
        
    
            public  Slice_O_Heaven()
            {
                storeName = "Slice O Heaven";
                storeAddress = "1234 Pizza Lane";
                storeEmail = "15895227103@163.com";
                storePhone = "123-456-7890";
                storeMenu = new String[]{"Cheese Pizza", "Pepperoni Pizza", "Veggie Pizza", "Meat Lovers Pizza"};
                pizzaIngredients = DEF_PIZZA_INGREDIENTS;
                OrderID = DEF_ORDER_ID;
                orderTotal = DEF_ORDER_TOTAL;
                pizzaPrices = new double[]{10.00, 12.00, 15.00, 18.00};
                Drinks = new String[]{"Coke", "Pepsi", "Sprite", "Root Beer"};
                Drinksprices = new double[]{1.00, 1.00, 1.00, 1.00};
                input = new Scanner(System.in);
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
                return orderTotal;
            }
            public void setOrderTotal(double orderTotal) {
                this.orderTotal = orderTotal;
            }
            public void choosePizza()
            {
               
                System.out.println("Choose a pizza: ");
                String choice = input.nextLine();
                setOrderpizza(choice);
                System.out.println("You chose: " + getOrderpizza());
                System.out.println("Do you want extra cheese (Y/N):");
            }
            public void chooseSize()
            {
                
                System.out.println("Choose a size: ");
                String choice = input.nextLine();
                setOrderSize(choice);
                System.out.println("You chose: " + getOrderSize());
             
            }
            public void chooseDrink()
            {
             
                System.out.println("Choose a drink: ");
                String choice = input.nextLine();
                setorderDrinks(choice);;
                System.out.println("You chose: " + getorderDrinks());
             
            }
            public void choosePizzaIngredients()
            {
            
                System.out.println("Choose PizzaIngredients: ");
                String choice = input.nextLine();
                setorderPizzaIngredients(choice);
                System.out.println("You chose: " + getorderPizzaIngredients());
        
            }
            public void closeScanner() {
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

                System.out.println("Total price: " + total);
                for(int i = 0; i < Drinks.length; i++)
                {
                    if(getorderDrinks().equals(Drinks[i]))
                    {
                        total += Drinksprices[i];
                    }
                }
                System.out.println("Pizza price: " + total);
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
                orderTotal=calculateTotal();
                System.out.println("Order total: " + orderTotal);
                System.out.println("********RECEIPT********");
                System.out.println("Order ID: " + OrderID);
                System.out.println("Order Total: " + orderTotal);
            }
            public void specialOfTheDay(String pizzaOfTheDay, String sideOfTheDay, String specialPrice) 
            {
                this.sideOfTheDay = pizzaOfTheDay;
                this.sideOfTheDay = sideOfTheDay;
                this.specialPrice = specialPrice;
            System.out.println("********SPECIAL OF THE DAY********");
            System.out.println("Pizza of the day: " + pizzaOfTheDay);
            System.out.println("Side of the day: " + sideOfTheDay);
            System.out.println("Special Price: " + specialPrice);
            }
            public void processCardPayment(String  cardNumber, String expiryDate,int cvv)
            {
                    int cardLength = cardNumber.length();
                    int firstCardDigit = Integer.parseInt(cardNumber.substring(0, 1));
                    String blacklistedNumber = "12345678901234"; 
                    if (cardLength == 14) 
                    {
                        System.out.println("Card accepted");
                        if (cardNumber.equals(blacklistedNumber)) 
                        {
                        System.out.println("Card is blacklisted. Please use another card");
                        }
                        else
                        {
                            int lastFourDigits = Integer.parseInt(cardNumber.substring(10));
                            String firstChar = cardNumber.substring(0, 1);
                            String lastFour = cardNumber.substring(10);
                            String middle = "*********";
                            String cardNumberToDisplay = firstChar + middle + lastFour;
                            System.out.println("First card digit: " + firstCardDigit);
                            System.out.println("Last four digits: " + lastFourDigits);
                            System.out.println("Card number to display: " + cardNumberToDisplay);
                        }
                    } 
                    else 
                    {
                        System.out.println("Invalid card");
                    } 
             }
            
      
}