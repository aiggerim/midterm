package CoffeeShopSimulator;

public class CoffeeShopDemo {
    public static void main(String[] args) {
        Coffee coffee = CoffeeFactory.createCoffee("latte");
        coffee = new MilkDecorator(coffee);
        coffee = new CaramelDecorator(coffee);

        System.out.println("Order: " + coffee.getDescription());
        System.out.println("Total Cost: $" + coffee.getCost());
    }
}
