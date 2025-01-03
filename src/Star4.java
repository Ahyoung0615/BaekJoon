import java.util.Scanner;

public class Star4 {
    public static void main(String[] args) {
        // 백준 2441
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < number - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
