import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the year : ");
            int n = sc.nextInt();
            if (leapYear(n)) {
                System.out.println("it is a leap year");
            } else {
                System.out.println("it is not a leap year");
            }
        }

    }

    static boolean leapYear(int n) {
        return ((n % 400 == 0) && (n % 100 != 0) || (n % 4 == 0));
    }
}
