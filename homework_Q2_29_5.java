
public class homework_Q2_29_5 {

	public static void main(String[] args) {
		int rows = 3; 

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == 1&&(j == 1 || j == 2 || j == 3 ||j==4)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();

	}

}
}
