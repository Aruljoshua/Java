public class Steps {
    public static void main(String[] argss) {
        int step = 0;
        int[] arr = new int[] { -2, 4, 5 };
        int mul = 0;
        while (mul != 1) {
            mul = 1;

            for (int i = 0; i < arr.length; i++) {
                for (int j = 1; j < arr.length; j++) {
                    mul = mul * arr[j];
                }

                if (arr[i] > 1 && mul != 1) {
                    arr[i] = arr[i] - 1;
                    step += 1;

                } else if (arr[i] == 0 && mul != 1) {

                    if (mul < 0 && mul != 1) {
                        arr[i] -= arr[i];
                        step += 1;
                    } else if (mul != 1) {
                        arr[i] += 1;
                        step += 1;
                    }
                } else if ((arr[i] < -1 && mul != 1)) {
                    arr[i] = arr[i] + 1;

                    step += 1;
                }

            }

        }
        System.out.println("the multiplication is :" + mul);
        System.out.println(step);

    }
}
