import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Slice_O_Heaven pizza = new Slice_O_Heaven();
        Scanner scanner = new Scanner(System.in);
  
        pizza.setOrderID("1234");
        pizza.displayMenu();
        pizza.choosePizza();
        pizza.takeOrder();
        scanner.close();
    }
}