import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // 백준 및 프로그래머스 아무거나
        // Scanner scanner = new Scanner(System.in);

        int[] arr = {0, 1, 2, 3, 4};
        int[][] queries = {{0, 3}, {1, 2}, {1, 4}};

        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(arr, queries)));
    }
}

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        for (int i = 0; i < queries.length; i++) {
            
        }
        return answer;
    }
}