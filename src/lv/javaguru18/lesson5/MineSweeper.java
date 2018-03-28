package lv.javaguru18.lesson5;

/**
 * Created by Vix on 3/8/2018.
 */
public class MineSweeper {
    static int height = 10, width = 10;
    public static void main(String[] args) {

        double mineFrequency = 0.3;
        boolean[][] bombs = new boolean[height+2][width+2];
        int[][] solution = new int[height+2][width+2];

        fillBombs(height, width, mineFrequency, bombs);
        printBombs(bombs);
        findSolution(bombs, solution);

        System.out.println("---------------------------");

        for (int i=1; i<=solution.length-2; i++) {
            for (int j = 1; j <= solution[1].length-2; j++) {
                if (bombs[i][j])
                    System.out.print("[X]");
                else if (solution[i][j] == 0) {
                    System.out.print("[ ]");
                }
                else
                    System.out.print("["+solution[i][j]+"]");
            }
            System.out.println();
        }
    }

    private static void findSolution(boolean[][] bombs, int[][] solution) {
        for (int i=1; i<=height; i++) {
            for (int j = 1; j <= width; j++) {
                for (int ii=i-1; ii<=i+1; ii++) {
                    for (int jj=j-1; jj <= j+1; jj++) {
                        if (bombs[ii][jj]) {
                            solution[i][j]++;
                        }
                    }
                }
            }
        }
    }

    private static void fillBombs(int height, int width, double mineFrequency, boolean[][] bombs) {
        for (int i=1; i<=height; i++) {
            for (int j = 1; j <= width; j++) {
                bombs[i][j] = Math.random() < mineFrequency;
            }

        }
    }

    private static void printBombs(boolean[][] bombs) {
        for (int i=1; i<=bombs.length-2; i++) {
            for (int j = 1; j <= bombs[1].length-2; j++) {
                if (bombs[i][j])
                    System.out.print("[X]");
                else
                    System.out.print("[ ]");
            }
            System.out.println("");
        }
    }

}
