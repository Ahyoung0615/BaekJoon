import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class NumberSort {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // 첫 번째 줄에서 배열의 크기 입력
        int number = Integer.parseInt(reader.readLine());

        // 배열에 숫자 저장
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            String input = reader.readLine();
            array[i] = Integer.parseInt(input);
        }

        Arrays.sort(array);

        // 출력 최적화
        StringBuilder sb = new StringBuilder();
        for (int i : array) {
            sb.append(i).append("\n");
        }
        System.out.print(sb.toString());
    }
}
