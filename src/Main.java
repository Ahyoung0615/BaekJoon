import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // 백준 아무거나
        // Scanner scanner = new Scanner(System.in);/

        int[] numbers = {1, 2, 3, 4, 5};

        Solution solution = new Solution();
        System.out.println(solution.solution(numbers));
    }
}

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1] * numbers[numbers.length - 2];
    }
}


