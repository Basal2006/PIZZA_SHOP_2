import java.util.Scanner;

class Slice_o_Heaven {
    String storeName;
    String storeAddress;
    String storeEmail;
    String storePhone;
    String[] storeMenu;
    String[] pizzaIngredients;
    double pizzaPrice;
    String[] sides;
    String[] drinks;
    int orderID;
    double orderTotal;

    public Slice_o_Heaven(String storeName, String storeAddress, String storeEmail, String storePhone,
                          String[] storeMenu, String[] pizzaIngredients, double pizzaPrice,
                          String[] sides, String[] drinks) {
        this.storeName = storeName;
        this.storeAddress = storeAddress;
        this.storeEmail = storeEmail;
        this.storePhone = storePhone;
        this.storeMenu = storeMenu;
        this.pizzaIngredients = pizzaIngredients;
        this.pizzaPrice = pizzaPrice;
        this.sides = sides;
        this.drinks = drinks;
        this.orderID = 0;
        this.orderTotal = 0;
    }

    public void takeOrder() {
        orderID++;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("How many pizzas do you want?");
            int numPizzas = scanner.nextInt();
            orderTotal += numPizzas * pizzaPrice;
        }
    }

    public void makePizza() {
        System.out.println("The following ingredients are being used to make pizza: ");
        for (String ingredient : pizzaIngredients) {
            System.out.print(ingredient + " ");
        }
        System.out.println();
    }

    public void printReceipt() {
        System.out.println("Store name: " + storeName);
        System.out.println("Store address: " + storeAddress);
        System.out.println("Order ID: " + orderID);
        System.out.println("order total: $" + orderTotal);
    }
}