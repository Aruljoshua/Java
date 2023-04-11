import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the two numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("the number entered are :" + "a=" + a + " b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("the numbers after swaped are :" + "a =" + a + "b= " + b);

    }
}
