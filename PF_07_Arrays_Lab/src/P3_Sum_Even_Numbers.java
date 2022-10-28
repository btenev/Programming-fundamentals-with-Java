import java.util.Arrays;
import java.util.Scanner;

public class P3_Sum_Even_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int evenSum = 0;
        for (int i = 0; i <= numbers.length - 1; i++) {
            if (numbers[i] % 2 == 0) {
                evenSum += numbers[i];
            }
        }
        System.out.println(evenSum);
    }
}
