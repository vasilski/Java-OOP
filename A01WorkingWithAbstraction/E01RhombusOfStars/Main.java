package A01WorkingWithAbstraction.E01RhombusOfStars;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        System.out.println(getTriangleOfStars(n, true));
        System.out.println(getTriangleOfStars(n, false));

    }

    public static String getTriangleOfStars(int n, boolean isUpwardsOrientated) {
        StringBuilder out = new StringBuilder();

        for (int r = 1; r <= n; r++) {
            int spacesCount = isUpwardsOrientated ? n - r : r;
            int starsCount = isUpwardsOrientated ? r : n - r;
            out.append(repeatString(spacesCount, " "));
            out.append(repeatString(starsCount, "* "));
            if (r!= n) {
                out.append(System.lineSeparator());
            }
        }
        return out.toString();
    }

    public static String repeatString(int count, String toRepeat) {
        StringBuilder out = new StringBuilder();

        for (int i = 0; i < count; i++) {
            out.append(toRepeat);
        }

        return out.toString();
    }
}
