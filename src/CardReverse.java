import java.util.Scanner;

public class CardReverse {
    public static void main(String[] args) {
        // 백준 10804
        Scanner scanner = new Scanner(System.in);

        int[] cards = new int[20];
        for (int i = 0; i < 20; i++) {
            cards[i] = i + 1;
        }

        for (int i = 0; i < 10; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            while (A < B) {
                int temp = cards[A - 1];
                cards[A - 1] = cards[B - 1];
                cards[B - 1] = temp;
                A++;
                B--;
            }
        }

        for (int card : cards) {
            System.out.print(card + " ");
        }
    }
}
