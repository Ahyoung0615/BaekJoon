import java.util.Scanner;

public class WordStudy {
    public static void main(String[] args) {
        // 백준 1157
        Scanner scanner = new Scanner(System.in);

        int[] charArray = new int[26];
        int max = 0;
        int count = 0;
        String word = scanner.nextLine().toUpperCase();

        for (char c : word.toCharArray()) {
            charArray[c - 'A']++;
        }

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] > max) {
                max = charArray[i];
                count = 1;
            } else if (charArray[i] == max) {
                count++;
            }
        }

        if (count > 1) {
            System.out.println("?");
        } else {
            for (int i = 0; i < 26; i++) {
                if (charArray[i] == max) {
                    System.out.println((char) (i + 'A'));
                    break;
                }
            }
        }
    }
}
