import java.util.*;

public class SevenDwarfs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] heights = new int[9];

        for (int i = 0; i < 9; i++) {
            heights[i] = sc.nextInt();
        }

        outer:
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                int sum = 0;
                for (int k = 0; k < 9; k++) {
                    if (k != i && k != j) {
                        sum += heights[k];
                    }
                }
                if (sum == 100) {
                    List<Integer> result = new ArrayList<>();
                    for (int k = 0; k < 9; k++) {
                        if (k != i && k != j) {
                            result.add(heights[k]);
                        }
                    }
                    Collections.sort(result);
                    for (int height : result) {
                        System.out.println(height);
                    }
                    break outer;
                }
            }
        }

        sc.close();
    }
}
