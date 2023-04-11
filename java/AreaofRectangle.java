import java.util.Scanner;

public class AreaofRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length");
        int length = sc.nextInt();
        System.out.println("enter the breadth");
        int breadth = sc.nextInt();
        int area = length * breadth;
        System.out.println("the area of rectangle is:  " + area);

    }
}