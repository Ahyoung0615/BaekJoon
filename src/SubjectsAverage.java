import java.util.Scanner;

public class SubjectsAverage {
    public static void main(String[] args) {
        // 백준 25206
        // 전공평점 = (학점 * 과목평점) / 학점 총합. P || F 제와
        Scanner scanner = new Scanner(System.in);

        double scoreAverage = 0.0;
        double gradeAverage = 0.0;
        String grade = "";

        for (int i = 0; i < 20; i++) {
            scanner.next();
            double score = scanner.nextDouble();
            grade = scanner.next();

            if (!grade.equals("P")) {
                scoreAverage += score;

                switch (grade) {
                    case "A+":
                        gradeAverage += 4.5 * score;
                        break;
                    case "A0":
                        gradeAverage += 4.0 * score;
                        break;
                    case "B+":
                        gradeAverage += 3.5 * score;
                        break;
                    case "B0":
                        gradeAverage += 3.0 * score;
                        break;
                    case "C+":
                        gradeAverage += 2.5 * score;
                        break;
                    case "C0":
                        gradeAverage += 2.0 * score;
                        break;
                    case "D+":
                        gradeAverage += 1.5 * score;
                        break;
                    case "D0":
                        gradeAverage += score;
                        break;
                    case "F":
                        gradeAverage += 0.0 * score;
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + grade);
                }
            }
        }

        System.out.printf("%.6f%n", gradeAverage / scoreAverage);
    }
}
