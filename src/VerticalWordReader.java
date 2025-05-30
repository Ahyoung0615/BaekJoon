import java.util.Scanner;

public class VerticalWordReader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = new String[5];
        int maxLen = 0;

        // 5줄 입력받고 최대 길이 확인
        for (int i = 0; i < 5; i++) {
            words[i] = scanner.nextLine();
            if (words[i].length() > maxLen) {
                maxLen = words[i].length();
            }
        }

        // 세로로 읽기
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < maxLen; i++) {
            for (int j = 0; j < 5; j++) {
                if (i < words[j].length()) {
                    result.append(words[j].charAt(i));
                }
            }
        }

        System.out.println(result);
    }
}
