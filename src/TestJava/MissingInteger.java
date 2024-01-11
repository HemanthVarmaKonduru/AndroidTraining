package TestJava;

public class MissingInteger {
        public static void main(String[] args) {
            // Example array with one missing integer
            int[] array = {1, 2, 3, 5, 6, 7, 8,9, 10};
            int missingNumber = MissingNumber(array);
            System.out.println("Missing number: " + missingNumber);
        }

        public static int MissingNumber(int[] array) {
            int n = array.length+1;
            int expectedSum = n * (n + 1) / 2;
            int actualSum = 0;
            for (int num : array) {
                actualSum += num;
            }
            return expectedSum - actualSum;
        }
    }

