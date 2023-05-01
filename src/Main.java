import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();   // int[] arr — объявление массива
        // generateRandomArray() — вызов метода «сгенерироватьМассив»
        int arrSum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            arrSum = arrSum + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + arrSum + " рублей.");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int arrMax = -1;
        int arrMin = 200_000;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arrMax) {
                arrMax = arr[i];
            }
            if (arr[i] < arrMin) {
                arrMin = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + arrMin + " рублей. Максимальная сумма трат за день составила " + arrMax + " рублей.");
    }
    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        double averageSum = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            averageSum = averageSum + arr[i];
        }
        System.out.println("Средняя сумма трат за месяц составила " + averageSum/30 + " рублей.");
    }
    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }
}