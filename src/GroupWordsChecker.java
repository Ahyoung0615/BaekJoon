import java.util.Scanner;

public class GroupWordsChecker {
    public static void main(String[] args) {
        // 백준 1316
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        scanner.nextLine();
        String[] words = new String[count];

        for (int i = 0; i < count; i++) {
            words[i] = scanner.nextLine();
        }

    }

    
}