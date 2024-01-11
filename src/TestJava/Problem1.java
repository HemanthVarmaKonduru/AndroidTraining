package TestJava;

public class Problem1 {
//    Fibonacci series
public static void main(String[] args) {
    int n = 10;
    int n1 = 0;
    int n2 = 1;
    int n3 = 1;
    for (int i=1;i<=n;i++){
        System.out.println(n1);
        n1=n2;
        n2=n3;
        n3=n1+n2;
    }


}


}

