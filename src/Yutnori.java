import java.util.Scanner;

public class Yutnori {
    public static void main(String[] args) {
        // 백준 2490
        Scanner scanner = new Scanner(System.in);

        String[] results = {"E", "A", "B", "C", "D"};

        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += scanner.nextInt();
            }
            System.out.println(results[4 - sum]);
        }

        scanner.close();
    }
}
