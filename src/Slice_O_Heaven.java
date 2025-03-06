import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
public class Slice_O_Heaven 
{
   private Scanner input;
   public String storeName ;
   public String storeAddress ;
   public String storeEmail;
   public String storePhone;
   public String side;
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
   public String cardNumber;
    public String expiryDate;
    public int cvv;
        
    
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
                System.out.println("Your pizza is: " + getOrderpizza());
            }
            public void chooseSize()
            {
                System.out.println("Enter size of pizza (Small, Medium, Large): ");
                String choice = input.nextLine();
                setOrderSize(choice);
                System.out.println("Your pizza's size is: " + getOrderSize());
            }





            public void chooseDrink()
            {
             String Drinks="";
             int i=0;
                System.out.println("”Choose from one of the drinks below. We recommend Coca Cola:\r\n" + //
                                        " 1. Coca Cola\r\n" + //
                                        " 2. Cold coffee\r\n" + //
                                        " 3. Cocoa Drink\r\n" + //
                                        " 4. No drinks for me\r\n" + //
                                        " Enter your choice:");
                int choice = input.nextInt();
                switch(choice)
                {
                    case 1:

                        Drinks= "Coca Cola";
                        break;
                    case 2:

                        Drinks = "Cold coffee";
                        break;
                    case 3:

                        Drinks = "Cocoa Drink";
                        break;
                    case 4:

                        break;
                    default:
                        System.out.println("Invalid choice. Please pick from the given list:");
                        i=i-1;
                        break;
                
                }
                System.out.println("Your drink is: " + Drinks);
                     
              
            }



            public void isItYourBirthday()
            {
                System.out.println("When is your birthday(yyyy-MM-dd):");
                String birthday = input.nextLine();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                LocalDate birthdate = LocalDate.parse(birthday, formatter);
                LocalDate today = LocalDate.now();
                Period p = Period.between(birthdate, today);
                int age = p.getYears();
                if(age<18)
                {
                if(p.getMonths() == 0 && p.getDays() == 0)
                {
                    orderTotal = orderTotal / 2;
                    System.out.println("Congratulations! You pay only half the price for your order");
                }
                else
                {
                    System.out.println("Too bad! You do not meet the conditions to get our 50% discount");
                }
                } 
                else
                {
                    System.out.println("Too bad! You do not meet the conditions to get our 50% discount");
                }  
            }





public void makeCardPayment()
{
    System.out.println("Enter card number:");
    long cardNumber = input.nextLong();
    String cN = Long.toString(cardNumber);
    this.cardNumber = cN;
    System.out.println("Enter expiry date(yyyy-MM):");
    String expiryDate = input.nextLine();
    this.expiryDate = expiryDate;
    System.out.println("Enter CVV:");
    String cvv = input.nextLine();
    int num = Integer.parseInt(cvv);
    this.cvv = num;
    if(cvv.length() !=3)
    {
        System.out.println("Invalid CVV. CVV should be 3 digits long. Please try again.");
        cvv = "";
    }
}






public void processCardPayment( String cardNumber, String expiryDate,int cvv)
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
                String choice;
                String choiceing1;
                String choiceing2;
                String choiceing3;
                String[] choices = new String[6];
                System.out.println("Please pick any three of the following ingredients:\r\n" + //
                                        " 1. Mushroom\r\n" + //
                                        " 2. Paprika\r\n" + //
                                        " 3. Sun-dried tomatoes\r\n" + //
                                        " 4. Chicken\r\n" + //
                                        " 5. Pineapple\r\n" + //
                                        " Enter any three choices (1, 2, 3,…) separated by spaces:");
                 choice = input.nextLine();
                for(int i = 0; i < 3; i++)    
                {                 
                  switch(choice.substring(i*2,i*2+1)) 
                  {
                    case "1":
                        System.out.println("Mushroom");
                        choices[i] = "Mushroom";
                        break;
                    case "2":
                        System.out.println("Paprika");
                         choices[i]= "Paprika";
                        break;
                    case "3":
                        System.out.println("Sun-dried tomatoes");
                        choices[i] = "Sun-dried tomatoes";
                        break;
                    case "4":
                        System.out.println("Chicken");
                        choices[i] = "Chicken";
                        break;
                    case "5":
                        System.out.println("Pineapple");
                        choices[i] = "Pineapple";
                        break;
                    default:
                        System.out.println("Invalid choice(s). Please pick only from the given list:");
                        i=i-1;
                        break;
                    }                     
                }
                choiceing1 = choices[0];
                choiceing2 = choices[1];
                choiceing3 = choices[2];
                chooseDrink();
                System.out.println("Enter one side dish (Calzone, Garlic bread, None):");
                String sidedish = input.nextLine();
                this.side = sidedish;
                chooseSize();
                System.out.println("Do you want extra cheese (Y/N):");
                String side = input.nextLine();
                if(side.equals("Y")||side.equals("y"))
                {
                    setorderPizzaIngredients("Extra Cheese");
                }
                else
                {
                    setorderPizzaIngredients("No Extra Cheese");
                }
                System.out.println("The ingredients of the pizza are:"+choiceing1+","+choiceing2+","+choiceing3+","+getorderPizzaIngredients());
                System.out.println("The side dish is: " + side);
                orderTotal = calculateTotal();
                System.out.println("Would you like the chance to pay only half for your order? (Y/N):");
                String halfOff = input.nextLine();
                if(halfOff.equals("Y")||halfOff.equals("y"))
                {
                    isItYourBirthday();
                }
                else
                {
                    makeCardPayment();
                    processCardPayment( cardNumber, expiryDate, cvv);
                }
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
            public void closeScanner() {
                input.close();
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
            
      
}