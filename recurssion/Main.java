package recurssion;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //print name 5 times

        printName("str", 0, 5);

        printNSum(5, 5, 0);

        int[] array = new int[]{1, 2, 3, 4, 5};
        reverseArray(array, 0, array.length);

    }

    private static void reverseArray(int[] array, int i, int n) {

        if (i >= n / 2) {
            System.out.println("The reverse is :: " + Arrays.toString(array));
            return;
        }

        swapArray(array, i, n - i - 1);

        reverseArray(array, i + 1, n);
    }

    private static void swapArray(int[] array, int i, int j) {

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void printNSum(int j, int fixedNumber, int sum) {

        if (j < 0) {
            System.out.println(sum);
            return;
        }
        sum += j;
        printNSum(--j, fixedNumber, sum);
    }

    private static void printName(String str, int i, int N) {
        if (i > N) {
            return;
        }
        System.out.println(str + " " + i);
        printName(str, ++i, N);
    }
}
