public class Main {
    public static void main(String[] args) {
        String storeName = "Slice - o - Heaven";
        String storeAddress = "123 Pizza Street";
        String storeEmail = "info@sliceoheaven.com";
        String storePhone = "123 - 456 - 7890";
        String[] storeMenu = {"Margarita Pizza", "Pepperoni pizza", "Hawaiian Pizza"};
        String[] pizzaIngredients = {"flour", "ketchup", "cheese"};
        double pizzaPrice = 10.0;
        String[] sides = {"Garlic bread", "salad"};
        String[] drinks = {"cola", "Sprite "};

        Slice_o_Heaven pizzeria = new Slice_o_Heaven(storeName, storeAddress, storeEmail, storePhone,
                storeMenu, pizzaIngredients, pizzaPrice, sides, drinks);
        pizzeria.takeOrder();
        pizzeria.makePizza();
        pizzeria.printReceipt();
    }
}