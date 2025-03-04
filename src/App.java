import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Slice_O_Heaven pizza = new Slice_O_Heaven();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your processCard number: ");
        String cardNumber  = scanner.next();
        System.out.print("Please enter your expiryDate: ");
        String expiryDate  = scanner.next();
        System.out.print("Please enter your cvv: ");
        int cvv  = scanner.nextInt();
        pizza.processCardPayment(cardNumber,expiryDate,cvv);
        pizza.setOrderID("1234");
        pizza.displayMenu();
        pizza.choosePizza();
        pizza.chooseSize();
        pizza.chooseDrink();
        pizza.choosePizzaIngredients();
        pizza.takeOrder();
        scanner.close();
    }
}