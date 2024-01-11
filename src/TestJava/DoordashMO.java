package TestJava;
//method overriding example
public class DoordashMO extends Order {
    public void placeOrder(String dishName) {
        System.out.println("Placing order for: " + dishName);
    }

    public static void main(String[] args) {
        DoordashMO doordashMO = new DoordashMO();


        doordashMO.placeOrder("Idli");
        doordashMO.placeOrder("Biryani", "Bawarchi");
        doordashMO.placeOrder("Panneer", 5);
    }
}


