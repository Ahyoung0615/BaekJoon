import java.util.Scanner;

public class Star6 {
    public static void main(String[] args) {
        // 백준 2443
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j  < 2 * (number - i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
