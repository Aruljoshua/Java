import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the choice" + "1.add" + "2.sub " + "3.mul" + "4.div");
        int ch = sc.nextInt();
        System.out.println("enter the two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 0;
        switch (ch) {
            case 1:
                ans = add(a, b);
                System.out.println(ans);
                break;
            case 2:
                ans = sub(a, b);
                System.out.println(ans);
                break;
            case 3:
                ans = mul(a, b);
                System.out.println(ans);
                break;
        }

    }

    static int add(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static int mul(int a, int b) {
        return a * b;
    }
}