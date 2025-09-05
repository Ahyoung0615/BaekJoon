import java.util.Scanner;

public class Resistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstColor = sc.nextLine();
        String secondColor = sc.nextLine();
        String thirdColor = sc.nextLine();

        long resistance = calculateResistance(firstColor, secondColor, thirdColor);

        System.out.println(resistance);
    }

    private static long calculateResistance(String firstColor, String secondColor, String thirdColor) {
        ResistorColor first = parseColor(firstColor);
        ResistorColor second = parseColor(secondColor);
        ResistorColor third = parseColor(thirdColor);

        return ((first.getValue() * 10L) + second.getValue()) * third.getMultiplier();
    }

    private static ResistorColor parseColor(String color) {
        return ResistorColor.valueOf(color.toUpperCase());
    }
}


enum ResistorColor {
    BLACK(0, 1),
    BROWN(1, 10),
    RED(2, 100),
    ORANGE(3, 1000),
    YELLOW(4, 10000),
    GREEN(5, 100000),
    BLUE(6, 1000000),
    VIOLET(7, 10000000),
    GREY(8, 100000000),
    WHITE(9, 1000000000);

    private final int value;
    private final int multiplier;

    ResistorColor(int value, int multiplier) {
        this.value = value;
        this.multiplier = multiplier;
    }

    public int getValue() {
        return value;
    }

    public int getMultiplier() {
        return multiplier;
    }
}