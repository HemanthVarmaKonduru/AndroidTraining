package TestJava;

import java.util.ArrayList;

public class Problem2 {
//    Null pointer exception and index out of bound exception
public static void main(String[] args) {
    String S1 = null;
    String S2 = "Index";
    System.out.println(S1.length());
    ArrayList<Integer> L_Int = new ArrayList<Integer>();
    L_Int.add(1);
    L_Int.add(2);
    L_Int.add(3);
    L_Int.add(4);
    System.out.println(L_Int.get(5));
}


}


