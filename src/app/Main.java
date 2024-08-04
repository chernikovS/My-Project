package app;

import java.util.Arrays;

public class Main {

    static int firstNegative = -1;
    static int sumOfNegatives;
    static int evenNumbers;
    static int oddNumbers;
    static int maxNumber;
    static int minNumber;
    static double countAfterNegative;
    static double sumAfterNegative;
    static double averageAfterNegative;

    public static void main(String[] args) {

        int[] numbers = {27, 33, -17, 77, -1, 89, 5, 12, -80, 10,
                91, 0, -39, 18, 99, -3, 25, 11, 63, -56};
        System.out.println("Елементи масиву: " + Arrays.toString(numbers));

        sumOfNegatives = 0;
        for(int num:numbers) {
            if(num < 0) {
                sumOfNegatives += num;
            }
        }
        System.out.println("Сума від'ємних чисел: " + sumOfNegatives);

        for(int num:numbers) {
            if(num % 2 == 0) {
                evenNumbers++;
            }
            else {
                oddNumbers++;
            }
        }
        System.out.println("Кількість парних чисел: " + evenNumbers +
                "\nКількість непарних чисел: " + oddNumbers);

        maxNumber = 0;
        minNumber = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[maxNumber]) {
                maxNumber = i;
            }
            else if (numbers[i] < numbers[minNumber]) {
                minNumber = i;
            }
        }
        System.out.println("Найменший елемент: " + numbers[minNumber] +
                " (з індексом " + minNumber + ")" +
                "\nНайбільший елемент: " + numbers[maxNumber] +
                " (з індексом " + maxNumber + ")");

        for(int i = firstNegative + 1; i < numbers.length; i++) {
            sumAfterNegative += numbers[i];
            countAfterNegative++;
        }
        averageAfterNegative = sumAfterNegative / countAfterNegative;
        System.out.printf("Середнє арифметичне чисел після першого " +
                "від'ємного числа: %.2f", averageAfterNegative);
    }
}