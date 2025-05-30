import java.util.Scanner;

public class ZOAC_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int rows = (H - 1) / (N + 1) + 1;
        int cols = (W - 1) / (M + 1) + 1;

        System.out.println(rows * cols);
    }
}
