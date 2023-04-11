import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the number to find the factorial of a number");
            int n = sc.nextInt();
            int answer = factorial(n);
            System.out.println("the factorial of number is :" + answer);
        }

    }

    static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }
}