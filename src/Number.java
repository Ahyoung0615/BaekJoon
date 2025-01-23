import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        // 백준 10093
        Scanner scanner = new Scanner(System.in);

        long first = scanner.nextLong();
        long second = scanner.nextLong();
        int index = 0;

        if(second > first) {
            System.out.println(second-first-1);
            for(long i = first+1; i<second; i++) System.out.print(i+" ");
        }
        if(first > second) {
            System.out.println(first-second-1);
            for(long i = second+1; i<first; i++) System.out.print(i+" ");
        }
        if(first == second) {
            System.out.println("0");
        }
    }
}
