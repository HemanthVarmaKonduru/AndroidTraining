package TestJava;

//Can you prove that a String object in Java is immutable programmatically
public class Problem5 {

     public static void main(String[] args) {
            String S1 = "Hello";
            String S2 = S1 + " World";
            System.out.println("Original String: " + S1);
            System.out.println("Concatenated String: " + S2);
        }
}

