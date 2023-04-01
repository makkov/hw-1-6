package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = generateRandomArray(30);
        task1(arr);
        task2(arr);
        task3(arr);

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        task4(reverseFullName);
    }

    private static int[] generateRandomArray(int dayCount) {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[dayCount];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }

        return arr;
    }

    private static void task1(int[] arr) {
        int sum = 0;

        for (int i : arr) {
            sum += i;
        }

        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    private static void task2(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i : arr) {
            if (i < min) {
                min = i;
            } else if (i > max) {
                max = i;
            }
        }

        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");
    }

    private static void task3(int[] arr) {
        int sum = 0;

        for (int i : arr) {
            sum += i;
        }

        double avgSum = (double) sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + avgSum + " рублей");
    }

    private static void task4(char[] reverseFullName) {
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }
}
