public class Print {

    public static void main(String[] args) {
        int n = 10;
        int min = 0;
        int min1 = 0;

        for (int i = 0; i <= n; i++) {

            for (int j = 0; j <= n; j++) {

                min = Math.min(i, j);
                min1 = Math.min(n - i, n - j);
                int min2 = Math.min(min, min1);
                System.out.print(min2 + " ");

            }

            System.out.println();
        }
    }

}
