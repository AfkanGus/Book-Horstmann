import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class LotteryDrawing117 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Сколько чисел вы хотите выбрать?");
        int k = in.nextInt();

        System.out.println("В каком диапазоне чисел вы хотите выбрать?");
        int n = in.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        int[] result = new int[k];
        for (int i = 0; i < result.length; i++) {
            int r = (int) (Math.random() * n);
            result[i] = numbers[r];
            numbers[r] = numbers[n - 1];
            n--;
        }
        Arrays.sort(result);
        System.out.println("Попробуйте следующую комбинацию");
        for (int r : result) {
            System.out.println(r);
        }

    }
}
