package TestJava;
import java.util.Arrays;

public class CompareArrays {
        public static void main(String[] args) {
            int[] array1 = {1, 2, 3, 4, 5};
            int[] array2 = {789, 6, 3, 2, 1};
            boolean areEqual = CompareArrayElements(array1, array2);

            if (areEqual) {
                System.out.println("Arrays contain the same elements.");
            } else {
                System.out.println("Arrays does not have same elements.");
            }
        }

        private static boolean CompareArrayElements(int[] array1, int[] array2) {
            if (array1.length != array2.length) {
                return false;
            }
            Arrays.sort(array1);
            Arrays.sort(array2);

            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    return false;
                }
            }

            return true;
        }

}
