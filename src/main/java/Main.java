public class Main {

    public static void main(String[] args) {
        Drink drink = new Drink();
        drink.name = "rbzf";
        drink.price = 16;
        drink.containsAlcohol = true;
        drink.ingredient1.name = "Red bull";
        drink.ingredient1.quantity = 200;
        drink.ingredient2.name = "Finlandia";
        drink.ingredient2.quantity = 50;
        drink.ingredient3.name = "lod";
        drink.ingredient3.quantity = 20;

        int capacity;
        capacity = drink.ingredient1.quantity + drink.ingredient2.quantity + drink.ingredient3.quantity;

        System.out.println("Drink: " + drink.name);
        System.out.println("Cena: " + drink.price + " PLN");
        System.out.println("Czy zawiera alkohol? " + drink.containsAlcohol);
        System.out.println("Skladniki:");
        System.out.println(drink.ingredient1.name);
        System.out.println(drink.ingredient2.name);
        System.out.println(drink.ingredient3.name);
        System.out.println("Pojemnosc: " + capacity + "ml");
    }
}
