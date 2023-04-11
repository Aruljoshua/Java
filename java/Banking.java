import java.util.Scanner;

public class Banking {
    public static void main(String[] args) {
        int balance = 0;
        Scanner sc = new Scanner(System.in);

        String username = "deep";

        String password = "ajay123";
        System.out.println("enter the username");
        String username1 = sc.next();
        if (username.equals(username1)) {
            System.out.println("enter the password");
            String pass = sc.next();
            if (password.equals(pass)) {
                while (true) {
                    System.out.println(
                            "enter the choice \n" + "1. deposit\n" + "2.withdraw\n" + "3.balance check\n"
                                    + "4.pin change");
                    int ch = sc.nextInt();

                    switch (ch) {
                        case 1:
                            System.out.println("enter the amount");
                            balance += sc.nextInt();
                            break;
                        case 2:
                            System.out.println("enter the amount to withdraw");
                            balance -= sc.nextInt();
                            break;
                        case 3:
                            System.out.println("the available amount is :" + balance);
                            break;
                        case 4:
                            System.out.println("enter the password");

                            password = sc.next();
                            break;
                    }

                }
            } else {
                System.out.println("the login credentials are incorrect");
            }

        } else {
            System.out.println("the login credentials are incorrect");
        }

    }
}
