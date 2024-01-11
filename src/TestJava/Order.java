package TestJava;

// Method overloading example
public class Order {
    public void placeOrder(String dishName){
        System.out.println("Name of the dish: " + dishName);
    }

    public void placeOrder(String dishName, int quantity){
        System.out.println("Item ordered: " + dishName + " Count: " + quantity);
    }

    public void placeOrder(String dishName, String restaurantName){
        System.out.println("You have ordered " + dishName + " from " + restaurantName);
    }

    public static void main(String[] args) {
        Order order = new Order();
        order.placeOrder("Biryani");
        order.placeOrder("Biryani", 10);
        order.placeOrder("Biryani", "Bawarchi");
    }
}



