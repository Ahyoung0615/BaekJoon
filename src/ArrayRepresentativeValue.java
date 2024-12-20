import java.util.Arrays;
import java.util.Scanner;

public class ArrayRepresentativeValue {
    public static void main(String[] args) {
        // 백준 2587
        Scanner scanner = new Scanner(System.in);

        int[] numberArray = new int[5];
        int sum = 0;

        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = scanner.nextInt();
            sum += numberArray[i];
        }

        Arrays.sort(numberArray);

        System.out.println(sum / numberArray.length);
        System.out.println(numberArray[numberArray.length/2]);
    }
}
