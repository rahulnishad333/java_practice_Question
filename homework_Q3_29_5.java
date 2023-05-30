public class homework_Q3_29_5 {
    public static void main(String[] args) {
        int rows = 7; // Number of rows in the pattern

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == 0 || i == rows - 1 || j == 0 || (i == j && i >= rows / 2) || (i + j == rows - 1 && i >= rows / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
