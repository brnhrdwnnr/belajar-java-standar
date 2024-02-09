package programmer.zaman.now.classes;

import java.util.Arrays;

public class ArrayApp {
    public static void main(String[] args) {

        int[] numbers = {
                1, 4, 3, 2, 12, 6, 19, 86, 100
        };

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.binarySearch(numbers, 6));
        System.out.println(Arrays.binarySearch(numbers, 86));
        System.out.println(Arrays.binarySearch(numbers, 99));

        int[] result = Arrays.copyOf(numbers, 5);
        System.out.println(Arrays.toString(result));

        int[] result2 = Arrays.copyOfRange(numbers, 5, 10);
        System.out.println(Arrays.toString(result2));
    }
}
