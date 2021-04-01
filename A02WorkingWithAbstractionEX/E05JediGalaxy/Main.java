package A02WorkingWithAbstractionEX.E05JediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] matrix = new int[rows][cols];

        int value = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = value++;
            }
        }

        String positions = scanner.nextLine();
        long starsPowerCollected = 0;
        while (!positions.equals("Let the Force be with you")) {
            int[] ivoS = Arrays.stream(positions.split(" "))
                    .mapToInt(Integer::parseInt).toArray();
            int[] evil = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();
            int xE = evil[0];
            int yE = evil[1];

            while (xE >= 0 && yE >= 0) {
                if (xE >= 0 && xE < matrix.length && yE >= 0 && yE < matrix[0].length) {
                    matrix[xE][yE] = 0;
                }
                xE--;
                yE--;
            }

            int xI = ivoS[0];
            int yI = ivoS[1];

            while (xI >= 0 && yI < matrix[1].length) {
                if (xI >= 0 && xI < matrix.length && yI >= 0 && yI < matrix[0].length) {
                    starsPowerCollected += matrix[xI][yI];
                }

                yI++;
                xI--;
            }

            positions = scanner.nextLine();
        }

        System.out.println(starsPowerCollected);


    }
}
