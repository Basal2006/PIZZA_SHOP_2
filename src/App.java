public class App {
    public static void main(String[] args) throws Exception {
        Slice_O_Heaven pizza = new Slice_O_Heaven();
        pizza.setOrderID("1234");
        pizza.displayMenu();
        pizza.choosePizza();
        pizza.chooseSize();
        pizza.chooseDrink();
        pizza.choosePizzaIngredients();
        pizza.takeOrder();
        
    }
}