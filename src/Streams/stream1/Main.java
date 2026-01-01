package Streams.stream1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum1 = imperativeApproach(arr1);
        System.out.println("Sum using Imperative Approach: " + sum1);

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum2 = declarativeApproach(arr2);
        System.out.println("Sum using Declarative Approach: " + sum2);
    }

    private static int imperativeApproach(int[] arr1) {
        int sum1 = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 == 0) {
                sum1 += arr1[i];
            }
        }
        return sum1;
    }

    private static int declarativeApproach(int[] arr2) {
        return Arrays.stream(arr2).filter(n -> n % 2 == 0).sum();
    }
}
