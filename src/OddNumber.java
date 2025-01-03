import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args) {
        // 백준 2576
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[7];
        int odd = Integer.MAX_VALUE;
        int oddSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            if (numbers[i] % 2 == 1) {
                oddSum += numbers[i];
                if (odd > numbers[i]) {
                    odd = numbers[i];
                }
            }
        }

        if (oddSum == 0) {
            System.out.println(-1);
        }

        if (oddSum != 0) {
            System.out.println(oddSum);
            System.out.println(odd);
        }

    }
}
