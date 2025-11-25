public class P10 {
    public static void main(String[] args) {

        for (int i = 1; i <= 2 * 5 - 1; i++) {
            int stars;
            if (i <= 5) {
                stars = i;
            } else {
                stars = 2 * 5 - i;
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
