import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the principle , time , rate of interest");
        int p = sc.nextInt();
        int t = sc.nextInt();
        int r = sc.nextInt();
        float si = (p * t * r) / 100;
        System.out.println("the simple interest is :" + si);
    }
}